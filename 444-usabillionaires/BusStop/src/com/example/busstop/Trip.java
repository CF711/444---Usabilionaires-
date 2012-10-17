package com.example.busstop;

import java.util.ArrayList;

public class Trip {
	
	public String name;
	public ArrayList<Route> routes = new ArrayList<Route>();
	
	public Trip(String name, ArrayList<Route> routes){
		this.name = name;
		this.routes = routes;
	}
	
}
	
