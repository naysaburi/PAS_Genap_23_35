package com.example.pas_genap_23_35;

import com.google.gson.annotations.SerializedName;

public class SpainModel {
    @SerializedName("strTeam")
    private String strTeam;
    @SerializedName("strStadium")
    private String strStadium;
    @SerializedName("strBadge")
    private String strBadge;

    public SpainModel(String strTeam, String strStadium, String strBadge) {
        this.strTeam = strTeam;
        this.strStadium = strStadium;
        this.strBadge = strBadge;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public String getStrBadge() {
        return strBadge;
    }
}
