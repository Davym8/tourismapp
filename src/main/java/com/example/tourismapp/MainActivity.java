package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView topview, placesview;
    toprecyclerview toprecyclerview;
    Placesrecyclerview placesrecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Locations> locations = new ArrayList<>();
        ArrayList<Locations> places = new ArrayList<>();

        //setting up the horizontal recyclerview
        topview = findViewById(R.id.toprecyclerview);
        toprecyclerview = new toprecyclerview(new topdestination().getLocations(), this);
        topview.setAdapter(toprecyclerview);
        topview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        //setting up vertical recycler view
        placesview = findViewById(R.id.placesrecyclerview);
        placesrecyclerview = new Placesrecyclerview(new Places().getLocations(), this);
        placesview.setAdapter(placesrecyclerview);
        placesview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
    /*
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragment,fragment);

     */
}