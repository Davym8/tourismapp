package com.example.tourismapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Placesrecyclerview extends RecyclerView.Adapter<Placesrecyclerview.ViewHolder>
{
    private ArrayList<Locations> places;
    private Context context;

    public Placesrecyclerview(ArrayList<Locations> places, Context context)
    {
        this.places = places;
        this.context = context;
    }

    @NonNull
    @Override
    public Placesrecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(context).inflate(R.layout.populardestinations, parent, false);
        itemView.getContext();
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Placesrecyclerview.ViewHolder holder, int position)
    {
        holder.imageView.setImageResource(places.get(position).getImage());
        holder.locationname.setText(places.get(position).getName());
        holder.locationdescription.setText(places.get(position).getDescription());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("locationname", places.get(position).getName());
                bundle.putString("locationdescription", places.get(position).getDescription());
                bundle.putInt("locationimage", places.get(position).getImage());
                bundle.putString("locationtips", places.get(position).getTraveltips());


                AppCompatActivity activity = (AppCompatActivity) context;

                activity.getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.fragmentcontainer,LocationFragment.class, bundle).addToBackStack(null).commit();


            }
        });
    }

    @Override
    public int getItemCount()
    {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView locationname, locationdescription;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView = itemView.findViewById(R.id.placesimage);
            locationname = itemView.findViewById(R.id.locationname);
            locationdescription = itemView.findViewById(R.id.locationdescription);
        }

    }
}