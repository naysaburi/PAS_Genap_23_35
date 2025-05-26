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

public class CountryFragment extends Fragment {
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView rvCountry;
    private CountryAdapter countryAdapter;
    private List<CountryModel> countryModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country, container, false);

        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshCountry);
        rvCountry = view.findViewById(R.id.rvCountry);

        countryAdapter = new CountryAdapter(countryModels);
        rvCountry.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCountry.setAdapter(countryAdapter);

        swipeRefreshLayout.setOnRefreshListener(this::refreshData);

        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        refreshData();
    }

    private void refreshData() {
        countryModels.clear();
        countryAdapter.notifyDataSetChanged();
        fetchTeams();
    }

    private void fetchTeams() {
        swipeRefreshLayout.setRefreshing(true);

        ApiService apiService = ApiClient.getApiService();
        Call<CountryResponse> call =apiService.getAllCountry();

        call.enqueue(new Callback<CountryResponse>() {
            @Override
            public void onResponse(Call<CountryResponse> call, Response<CountryResponse> response) {
                swipeRefreshLayout.setRefreshing(false);
                if (response.isSuccessful() && response.body() != null) {
                    countryModels.addAll(response.body().getCountryModels());
                    countryAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(getContext(), "Gagal ambil data: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CountryResponse> call, Throwable t) {
                swipeRefreshLayout.setRefreshing(false);
                Toast.makeText(getContext(), "Failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}