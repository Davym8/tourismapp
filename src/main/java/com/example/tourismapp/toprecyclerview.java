package com.example.tourismapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class toprecyclerview extends RecyclerView.Adapter<toprecyclerview.ViewHolder>
{

    private ArrayList<Locations> locationsArrayList;
    private Context context;

    public toprecyclerview(ArrayList<Locations> locationsArrayList, Context context)
    {
        this.locationsArrayList = locationsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public toprecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(context).inflate(R.layout.destinationrow, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull toprecyclerview.ViewHolder holder, int position)
    {
        holder.imageView.setImageResource(locationsArrayList.get(position).getImage());
    }

    @Override
    public int getItemCount()
    {
        return locationsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView = itemView.findViewById(R.id.locimage);
        }
    }
}
