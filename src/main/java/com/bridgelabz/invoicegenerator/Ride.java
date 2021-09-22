package com.bridgelabz.invoicegenerator;

public class Ride {
	private double distance;
	private int time;

	public Ride(double distance, int time) {
		super();
		this.distance = distance;
		this.time = time;
	}

	public double getDistance() {
		return distance;
	}

	public int getTime() {
		return time;
	}

}
