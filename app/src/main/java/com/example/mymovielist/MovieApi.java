package com.example.mymovielist;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {


    @GET("movie/top_rated")
    Call<SuperModel> getTopRatedMovies(@Query("api_key") String token);


    @GET("movie/popular")
    Call<SuperModel> getPopularMovies(@Query("api_key") String token);



}
