package com.example.pas_genap_23_35;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SpainAdapter extends RecyclerView.Adapter<SpainViewHolder> {

    private List<SpainModel> spainModels;

    public SpainAdapter(List<SpainModel> spainModels) {
        this.spainModels = spainModels;
    }

    @NonNull
    @Override
    public SpainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_spain, parent, false);
        return new SpainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpainViewHolder holder, int position) {
        holder.bind(spainModels.get(position));
    }

    @Override
    public int getItemCount() {
        return spainModels.size();
    }
}
