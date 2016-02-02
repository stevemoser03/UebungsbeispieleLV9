package org.campus02.EventKalender;

public class Event {

	private String Title;
	private String Ort;
	private double Eintrittspreis;
	public Event(String title, String ort, double eintrittspreis) {
		super();
		Title = title;
		Ort = ort;
		Eintrittspreis = eintrittspreis;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getOrt() {
		return Ort;
	}
	public void setOrt(String ort) {
		Ort = ort;
	}
	public double getEintrittspreis() {
		return Eintrittspreis;
	}
	public void setEintrittspreis(double eintrittspreis) {
		Eintrittspreis = eintrittspreis;
	}
	@Override
	public String toString() {
		return "Event [Title=" + Title + ", Ort=" + Ort + ", Eintrittspreis=" + Eintrittspreis + "]";
	}
	
	
	
}
