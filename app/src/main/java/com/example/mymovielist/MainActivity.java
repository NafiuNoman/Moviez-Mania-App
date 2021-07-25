package com.example.mymovielist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MovieRecyclerAdapter movieRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.IdRecyeler);


        MovieApi movieApi = MyClient.getINSTANCE().create(MovieApi.class);

        Call<SuperModel> call = movieApi.getTopRatedMovies("0909d2a8b1ca446e8d910c750403f2ee");


        call.enqueue(new Callback<SuperModel>() {
            @Override
            public void onResponse(Call<SuperModel> call, Response<SuperModel> response) {

                Log.d("Response Code : ", "" + response.code());

                if (response.isSuccessful()) {
                    SuperModel superModel = response.body();


                    List<InsideModel> list = superModel.getResults();

                    movieRecyclerAdapter = new MovieRecyclerAdapter(list);

                    recyclerView.setAdapter(movieRecyclerAdapter);


                }


            }

            @Override
            public void onFailure(Call<SuperModel> call, Throwable t) {

                Log.d("onFailure: ", "" + t.getMessage());


            }
        });


    }
}