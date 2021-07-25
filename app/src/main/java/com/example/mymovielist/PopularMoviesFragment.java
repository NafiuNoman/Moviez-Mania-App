package com.example.mymovielist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Retrofit;

public class PopularMoviesFragment extends Fragment {

    Retrofit retrofit;


    public PopularMoviesFragment() {

        retrofit = MyClient.getINSTANCE();
        MovieApi movieApi = retrofit.create(MovieApi.class);

         Call<SuperModel> list  = movieApi.getTopRatedMovies("0909d2a8b1ca446e8d910c750403f2ee");



    }


    public static PopularMoviesFragment newInstance() {
        PopularMoviesFragment fragment = new PopularMoviesFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_movies, container, false);
    }



}