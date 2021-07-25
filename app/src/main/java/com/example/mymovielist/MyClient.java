package com.example.mymovielist;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyClient {

    private static Retrofit INSTANCE;
    private static final String BASE_URL="https://api.themoviedb.org/3/";



     private MyClient()
    {

    }

    public static Retrofit getINSTANCE()

    {

        if (INSTANCE==null)
        {
            INSTANCE= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return INSTANCE;




    }




}
