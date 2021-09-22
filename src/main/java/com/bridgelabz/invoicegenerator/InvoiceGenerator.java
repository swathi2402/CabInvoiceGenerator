package com.bridgelabz.invoicegenerator;

import com.bridgelabz.invoicegenerator.Ride.RideType;

public class InvoiceGenerator {

	public double calculateFare(double distance, int time, RideType rideType) {

		double COST_PER_KILOMETER = 0.0;
		double COST_PER_TIME = 0.0;
		double MINIMUM_FARE = 0.0;

		switch (rideType) {
		case NORMAL_RIDE:
			COST_PER_KILOMETER = 10.0;
			COST_PER_TIME = 1.0;
			MINIMUM_FARE = 5.0;
			break;

		case PREMIUM_RIDE:
			COST_PER_KILOMETER = 15.0;
			COST_PER_TIME = 2.0;
			MINIMUM_FARE = 20.0;
			break;
		}

		double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_TIME;

		return Math.max(totalFare, MINIMUM_FARE);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			double fare = this.calculateFare(ride.getDistance(), ride.getTime(), ride.getRideType());
			totalFare += fare;
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

}
