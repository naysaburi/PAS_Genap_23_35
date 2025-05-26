package com.example.pas_genap_23_35;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private List<CountryModel> countryModels;

    public CountryAdapter(List<CountryModel> countryModels) {
        this.countryModels = countryModels;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countryModels.get(position));
    }

    @Override
    public int getItemCount() {
        return countryModels.size();
    }
}
