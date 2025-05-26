package com.example.pas_genap_23_35;

import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class SpainViewHolder extends RecyclerView.ViewHolder {

    TextView tvTeamName, tvStadiumName;
    ImageView imgBadge;

    public SpainViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTeamName = itemView.findViewById(R.id.tvTeamName);
        tvStadiumName = itemView.findViewById(R.id.tvStadiumName);
        imgBadge = itemView.findViewById(R.id.imgBadge);
    }

    public void bind(SpainModel spainModel) {
        tvTeamName.setText(spainModel.getStrTeam());
        tvStadiumName.setText(spainModel.getStrStadium());

        Glide.with(itemView.getContext()).load(spainModel.getStrBadge()).into(imgBadge);
    }
}
