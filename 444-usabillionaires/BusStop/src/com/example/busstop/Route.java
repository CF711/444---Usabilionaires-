package com.example.busstop;

public class Route {
	public String name;
	public BusStop start;
	public BusStop end;
	
	public Route(BusStop start, BusStop end, String name){
		this.start = start;
		this.end = end;
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public BusStop getStart(){
		return this.start;
	}
	
	public BusStop getEnd(){
		return this.end;
	}
}
