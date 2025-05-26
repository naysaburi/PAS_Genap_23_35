package com.example.pas_genap_23_35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpainFragment extends Fragment {
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView rvSpain;
    private SpainAdapter spainAdapter;
    private List<SpainModel> spainModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_spain, container, false);

        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshSpain);
        rvSpain = view.findViewById(R.id.rvSpain);

        spainAdapter = new SpainAdapter(spainModels);
        rvSpain.setLayoutManager(new LinearLayoutManager(getContext()));
        rvSpain.setAdapter(spainAdapter);

        swipeRefreshLayout.setOnRefreshListener(this::refreshData);

        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        refreshData();
    }

    private void refreshData() {
        spainModels.clear();
        spainAdapter.notifyDataSetChanged();
        fetchTeams();
    }

    private void fetchTeams() {
        swipeRefreshLayout.setRefreshing(true);

        ApiService apiService = ApiClient.getApiService();
        Call<SpainResponse> call =apiService.getAllSpain();

        call.enqueue(new Callback<SpainResponse>() {
            @Override
            public void onResponse(Call<SpainResponse> call, Response<SpainResponse> response) {
                swipeRefreshLayout.setRefreshing(false);

                if (response.isSuccessful() && response.body() != null) {
                    spainModels.addAll(response.body().getSpain());
                    spainAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(getContext(), "Gagal ambil data: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SpainResponse> call, Throwable t) {
                swipeRefreshLayout.setRefreshing(false);
                Toast.makeText(getContext(), "Failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}