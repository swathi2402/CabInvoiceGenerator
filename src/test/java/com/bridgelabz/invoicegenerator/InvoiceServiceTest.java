package com.bridgelabz.invoicegenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {

	InvoiceGenerator invoiceGenerator = null;

	@Before
	public void setUp() throws Exception {
		invoiceGenerator = new InvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(25.0, fare, 0.0);
	}

	@Test
	public void givenMinimumDistance_ShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5.0, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		InvoiceSummary fare = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expected = new InvoiceSummary(2, 30.0);
		assertEquals(expected, fare);
	}

	@Test
	public void givenUserID_shouldReturnInvoiceSummary() {
		RideRepository rideRepository = new RideRepository();

		Ride[] ridesForUser1 = { new Ride(2.0, 5), new Ride(0.1, 1) };
		rideRepository.addUserRides(1, ridesForUser1);

		Ride[] ridesForUser2 = { new Ride(5.0, 5), new Ride(0.1, 1) };
		rideRepository.addUserRides(2, ridesForUser2);

		Ride[] rides = rideRepository.getUserRides(1);
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedSummary = new InvoiceSummary(2, 30.0);
		assertEquals(expectedSummary, summary);
	}
}
