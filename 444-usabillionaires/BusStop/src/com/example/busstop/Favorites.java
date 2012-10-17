package com.example.busstop;

import java.util.ArrayList;

public class Favorites {
	
	public ArrayList <Trip> favs;
	Favorites(){
		this.favs = new ArrayList<Trip>();
	}
	
	public ArrayList <Trip> getFavorites(){
		return this.favs;
	}
	
	public void add(Trip trip){
		this.favs.add(trip);
	}
}
