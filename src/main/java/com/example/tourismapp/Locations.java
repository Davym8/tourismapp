package com.example.tourismapp;

public class Locations
{
    private int index, image;
    private String name, description, traveltips;
    public Locations(int index, String name, String description,String traveltips, int image)
    {
        this.index = index;
        this.name = name;
        this.description = description;
        this.traveltips = traveltips;
        this.image = image;
    }
    public int getIndex()
    {
        return index;
    }
    public int getImage()
    {
        return image;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public String getTraveltips()
    {
        return traveltips;
    }
    public void setTraveltips(String traveltips)
    {
        this.traveltips = traveltips;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setImage(int image)
    {
        this.image = image;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
