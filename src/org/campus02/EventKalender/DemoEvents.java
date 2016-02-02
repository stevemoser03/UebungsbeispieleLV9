package org.campus02.EventKalender;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoEvents {
	
	public static void main(String[] args){
		
		EventKalender ek = new EventKalender();
		
		Event evt1 = new Event("Bauernbundball", "Graz", 35.00);
		Event evt2 = new Event("Dinner & Crime","Graz", 20.00);
		Event evt3 = new Event("Donauinselfest", "Wien", 40.00);
		
		ek.addEvent(evt1);
		ek.addEvent(evt2);
		ek.addEvent(evt3);
		
		Event byTitle = ek.getByTitle("Donauinselfest");
		System.out.println(byTitle);
		
		ArrayList<Event>byOrt = ek.getByOrt("Graz");
		System.out.println(byOrt);
		
		Event mostExp = ek.getMostExpensiveByOrt("Graz");
		System.out.println(mostExp);
	
		double avgPrice = ek.getAvgPreisByOrt("Graz");
		System.out.println(avgPrice);
	
		HashMap<String,Integer> result = ek.getCountByOrt();
		System.out.println(result);
		
	}

}
