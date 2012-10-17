package com.example.busstop;

import java.util.ArrayList;

public class History {
	
	ArrayList<Trip> hist;
	public History(){
		this.hist = new ArrayList<Trip>();
	}
	
	public ArrayList <Trip> getHistory(){
		return this.hist;
	}
	
	public void add(Trip trip){
		this.hist.add(trip);
	}
	
}
