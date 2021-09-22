package com.bridgelabz.invoicegenerator;

public class Ride {

	public enum RideType {

		NORMAL_RIDE, PREMIUM_RIDE
	}

	private double distance;
	private int time;
	private RideType rideType;

	public Ride(double distance, int time, RideType rideType) {
		super();
		this.distance = distance;
		this.time = time;
		this.rideType = rideType;
	}

	public double getDistance() {
		return distance;
	}

	public int getTime() {
		return time;
	}

	public RideType getRideType() {
		return rideType;
	}
}
