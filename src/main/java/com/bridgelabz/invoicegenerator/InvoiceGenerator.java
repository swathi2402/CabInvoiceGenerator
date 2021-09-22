package com.bridgelabz.invoicegenerator;

public class InvoiceGenerator {

	private static final double COST_PER_KILOMETER = 10;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_TIME;

		return Math.max(totalFare, MINIMUM_FARE);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride : rides) {
			double fare = this.calculateFare(ride.getDistance(), ride.getTime());
			totalFare += fare;
		}
		return null;
	}

}
