package com.example.pas_genap_23_35;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("3/search_all_teams.php?s=Soccer&c=Spain")
    Call<SpainResponse> getAllSpain();

    @GET("3/all_countries.php")
    Call<CountryResponse> getAllCountry();
}
