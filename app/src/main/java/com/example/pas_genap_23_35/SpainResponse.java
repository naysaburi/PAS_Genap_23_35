package com.example.pas_genap_23_35;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpainResponse {
    @SerializedName("teams")
    private List<SpainModel> spain;

    public List<SpainModel> getSpain() {
        return spain;
    }
}
