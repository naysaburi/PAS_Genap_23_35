package com.example.pas_genap_23_35;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CountryResponse {
    @SerializedName("countries")
    private List<CountryModel> countryModels;

    public List<CountryModel> getCountryModels() {
        return countryModels;
    }
}
