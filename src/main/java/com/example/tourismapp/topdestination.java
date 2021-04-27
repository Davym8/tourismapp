package com.example.tourismapp;

import java.util.ArrayList;
import java.util.LinkedList;

public class topdestination
{
    private ArrayList<Locations> locations = new ArrayList<>();
    public topdestination()
    {
        locations.add(new Locations(0,"Japan","description","tips",R.drawable.japan));
        locations.add(new Locations(1,"Germany","description","tips",R.drawable.germany));
        locations.add(new Locations(2,"Paris","description","tips",R.drawable.paris));
        locations.add(new Locations(3,"Thailand","description","tips",R.drawable.thailand));
        locations.add(new Locations(4,"Bora Bora","description","tips",R.drawable.borabora));
        locations.add(new Locations(5,"Canada","description","tips",R.drawable.canada));
        locations.add(new Locations(6,"Seattle","description","tips",R.drawable.seattle));
    }

    public ArrayList<Locations> getLocations()
    {
        return locations;
    }
}
