package com.example.mymovielist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mymovielist.databinding.MovierowBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder> {

    List<InsideModel> list;

    public MovieRecyclerAdapter(List<InsideModel> list) {
        this.list = list;
    }


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        MovierowBinding movierowBinding = MovierowBinding.inflate(layoutInflater, parent, false);

        MovieViewHolder movieViewHolder = new MovieViewHolder(movierowBinding);

        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(MovieRecyclerAdapter.MovieViewHolder holder, int position) {

        holder.movierowBinding.setMovieList(list.get(position));

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        MovierowBinding movierowBinding;


        public MovieViewHolder(MovierowBinding movierowBinding) {
            super(movierowBinding.getRoot());

            this.movierowBinding = movierowBinding;


        }
    }


}
