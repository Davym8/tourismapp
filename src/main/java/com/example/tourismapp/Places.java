package com.example.tourismapp;
import java.util.ArrayList;
public class Places
{
    private ArrayList<Locations> places = new ArrayList<>();

    public Places()
    {
        places.add(new Locations(0,"Japan","Japan is truly timeless, a place where ancient traditions are fused with modern life as if it were the most natural thing in the world.","Decide Whether to Buy a Japan Rail Pass, Travel with Plenty of Yen, Pack Light, Don't do PDA, No drinking or eating in public transport, Cover Your Tattoos, Take a Walk in the Woods, Discover True Relaxation at an Onsen",R.drawable.japan));
        places.add(new Locations(1,"Germany","Prepare for a roller-coaster ride of feasts, treats and temptations experiencing Germany's soul-stirring scenery, spirit-lifting culture, big-city beauties, romantic palaces and half-timbered towns.","Everything is closed on a sunday, Always be punctual, Water is not cheap, Using Public Restrooms are not Free, Expect to Share Tables",R.drawable.germany));
        places.add(new Locations(2,"Paris","Paris' monument-lined boulevards, museums, classical bistros and boutiques are enhanced by a new wave of multimedia galleries, creative wine bars, design shops and tech start-ups.","Parisians Eat Dinner Late, Paris Closes Up in August, Don’t Visit Paris Without Travel Insurance, Street food is the savior of backpackers worldwide and Paris is no different, The Paris Pass gives you free transport",R.drawable.paris));
        places.add(new Locations(3,"Thailand","Friendly and food-obsessed, hedonistic and historic, cultured and curious, Thailand tempts visitors with a smile as golden as the country's glittering temples and tropical beaches.","Don’t Drink the Tap Water, Don’t Ride The Elephants, Go Island Hopping, Sharpen your negotiating skills, Dress appropriately, Be scam savvy, Try street food.",R.drawable.thailand));
        places.add(new Locations(4,"Bora Bora","The stuff of dreams. As you arrive by plane, the view says it all. How not to be mesmerised by this stunning palette of sapphire, indigo and turquoise, all mixed together in modern-art abstractions? And these sand-edged islets and soaring rainforest's covered basaltic peaks?","Visit during the off season, All flights must go through Tahiti first, its very expensive, go snorkeling the reefs are fantastic, bora bora is french speaking and use francs.",R.drawable.borabora));
        places.add(new Locations(5,"Canada","Canada is more than its hulking-mountain, craggy-coast good looks: it also cooks extraordinary meals, rocks cool culture and unfurls wild, moose-spotting road trips.","Tipping is expected and usually 15-20%, peak season in canada is summer, visit the natural parks, Celebrate the Calgary Stampede, Hike the rainforest, visit The Yukon.",R.drawable.canada));
        places.add(new Locations(6,"Seattle","Blink and it’s changed: Seattle can be that ephemeral. Welcome to a city that heralds innovation and nature; a city always marching toward the future.","Ditch the car and pack walking shoes instead, Check out the Space Needle and Pike Place Market, The Seattle Freeze is very real, Mt Rainer National Park is a highlight worth going to, skip the winter months.",R.drawable.seattle));
    }
    public ArrayList<Locations> getLocations()
    {
        return places;
    }
}
