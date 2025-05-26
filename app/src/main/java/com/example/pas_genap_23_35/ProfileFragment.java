package com.example.pas_genap_23_35;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProfileAdapter adapter;
    private List<ProfileModel> profileList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerView = view.findViewById(R.id.rvProfile);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        profileList = new ArrayList<>();
        profileList.add(new ProfileModel("Firdaus Naysaburi", "X PPLG 1", "23", "firdausnaysaburi@gmail.com"));
        profileList.add(new ProfileModel("Sasi Kirana", "X PPLG 1", "35", "sasikirana@gmail.com"));

        adapter = new ProfileAdapter(getContext(), profileList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
