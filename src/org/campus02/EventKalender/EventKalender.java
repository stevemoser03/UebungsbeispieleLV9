package org.campus02.EventKalender;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {

	private ArrayList<Event> list = new ArrayList<>();

	
	public void addEvent(Event e){
		list.add(e);
	}
	
	public Event getByTitle(String title){
		for (Event event : list) {
			if(event.getTitle().equals(title)){
				return event;
			}
		}
		return null;
	}
	
	public ArrayList<Event>getByOrt(String ort){
		
		ArrayList<Event> places = new ArrayList<>();
		
		for (Event event : list) {
			if(event.getOrt().equals(ort)){
				places.add(event);
			}
		}
		return places;
	}
	
	public ArrayList<Event>getByEintrittsPreis(double min, double max){
		
		ArrayList<Event> prices = new ArrayList<>();
		
		for (Event event : list) {
			if(event.getEintrittspreis()>=min && event.getEintrittspreis()<=max)
			prices.add(event);
		}
	return prices;
}
	
	public Event getMostExpensiveByOrt(String ort){
		double tempPrice = 0;
		Event mostExp = null;
		for (Event event : list) {
			if(event.getEintrittspreis()>tempPrice && event.getOrt().equals(ort)){
				tempPrice = event.getEintrittspreis();
				mostExp = event;
			}
		}
		return mostExp;
	}
	
	public double getAvgPreisByOrt(String ort){
		double tempPrice = 0.0;
		int counter = 0;
		for (Event event : list) {
			if(event.getOrt().equals(ort))
				tempPrice += event.getEintrittspreis();
				counter++;
		}
		return tempPrice/counter;
	}
	
	public HashMap<String, Integer>getCountByOrt(){
		HashMap<String, Integer> map = new HashMap<>();
		for (Event event : list) {
			Integer value = map.get(event.getOrt());
			if(value!= null)
				map.put(event.getOrt(), value+1);
			else
				map.put(event.getOrt(), 1);
		}
		return map;
	}
}

