package com.example.pas_genap_23_35;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    ImageView imgCountry;
    TextView tvCountryName;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountryName = itemView.findViewById(R.id.tvCountryName);
        imgCountry = itemView.findViewById(R.id.imgCountry);
    }

    public void bind(CountryModel countryModel) {
        tvCountryName.setText(countryModel.getName_en());

        Glide.with(itemView.getContext()).load(countryModel.getFlag_url_32()).into(imgCountry);
    }
}
