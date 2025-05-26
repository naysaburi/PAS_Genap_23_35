package com.example.pas_genap_23_35;

import com.google.gson.annotations.SerializedName;

public class CountryModel {
    @SerializedName("name_en")
    private String name_en;

    @SerializedName("flag_url_32")
    private String flag_url_32;

    public CountryModel(String name_en, String flag_url_32) {
        this.name_en = name_en;
        this.flag_url_32 = flag_url_32;
    }

    public String getName_en() {
        return name_en;
    }

    public String getFlag_url_32() {
        return flag_url_32;
    }
}
