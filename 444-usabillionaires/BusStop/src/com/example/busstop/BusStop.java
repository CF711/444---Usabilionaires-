package com.example.busstop;

public class BusStop {
	public String name;
	public String startTime;
	public String endTime;
	
	public BusStop(String name, String startTime, String endTime){
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getStartTime(){
		return this.startTime;
	}
	
	public String getEndTime(){
		return this.endTime;
	}
}
