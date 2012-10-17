package com.example.busstop;

import java.util.ArrayList;

public class AllStops {

	public ArrayList<BusStop> create(){
		ArrayList<BusStop> allStops = new ArrayList<BusStop>();
		
		allStops.add(new BusStop("Gleason Circle", "3:30PM", "3:45PM"));
		allStops.add(new BusStop("Park Point South", "3:35PM", "3:50PM"));
		allStops.add(new BusStop("Residence Halls", "3:40PM", "3:55PM"));
		allStops.add(new BusStop("Park Point North", "3:45PM", "4:00PM"));
		allStops.add(new BusStop("Colony Manor", "4:00PM", "4:15PM"));
		allStops.add(new BusStop("Turf Field", "4:30PM", "4:45PM"));
		allStops.add(new BusStop("The Province", "5:21PM", "5:36PM"));
		allStops.add(new BusStop("Perkins Green", "5:34PM", "5:49PM"));
		allStops.add(new BusStop("Colony Manor", "5:42PM", "5:57PM"));
		allStops.add(new BusStop("The Province", "5:57PM", "6:12PM"));
		allStops.add(new BusStop("Residence Hall", "6:12PM", "6:27PM"));
		allStops.add(new BusStop("Tury Field", "6:28PM", "6:43PM"));
		allStops.add(new BusStop("Residence Hall", "7:30PM", "7:45PM"));
		allStops.add(new BusStop("Gleason Circle", "8:15PM", "8:22PM"));
		
		return allStops;
	}
	
}
