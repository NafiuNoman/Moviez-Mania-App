package com.example.mymovielist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder> {

    List<InsideModel> list;
    String imageUrlFirstPart = "https://image.tmdb.org/t/p/w500";


    public MovieRecyclerAdapter(List<InsideModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.movierow, parent, false);

        MovieViewHolder movieViewHolder = new MovieViewHolder(view);

        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MovieRecyclerAdapter.MovieViewHolder holder, int position) {


        holder.title.setText(list.get(position).getTitle());
        holder.date.setText(list.get(position).getRelease_date());

        Glide.with(holder.imageView.getContext()).load(imageUrlFirstPart + list.get(position).getPoster_path()).into(holder.imageView);



    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title,date;


        public MovieViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.IdRowTitleName);
            imageView = itemView.findViewById(R.id.IdMovieImage);
            date = itemView.findViewById(R.id.IdRowDate);


        }
    }


}
