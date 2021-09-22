package com.bridgelabz.invoicegenerator;

public class InvoiceSummary {

	private double numberOfRides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummary(double numberOfRides, double totalFare) {
		super();
		this.numberOfRides = numberOfRides;
		this.totalFare = totalFare;
		this.averageFare = totalFare / numberOfRides;
	}

	public double getNumberOfRides() {
		return numberOfRides;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public double getAverageFare() {
		return averageFare;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) obj;
		return numberOfRides == that.numberOfRides && Double.compare(that.totalFare, this.totalFare) == 0
				&& Double.compare(that.averageFare, this.averageFare) == 0;
	}

}
