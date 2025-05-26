package com.example.pas_genap_23_35;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileViewHolder extends RecyclerView.ViewHolder {

    TextView tvNamaProfile, tvKelas, tvAbsen, tvEmail;

    public ProfileViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNamaProfile = itemView.findViewById(R.id.tvNamaProfile);
        tvAbsen = itemView.findViewById(R.id.tvabsen);
        tvKelas = itemView.findViewById(R.id.tvkelas);
        tvEmail = itemView.findViewById(R.id.tvEmail);
    }

    public void bind(ProfileModel profileModel) {
        tvNamaProfile.setText(profileModel.getName());
        tvAbsen.setText(profileModel.getAbsen());
        tvKelas.setText(profileModel.getKelas());
        tvEmail.setText(profileModel.getEmail());
    }
}
