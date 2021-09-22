package com.bridgelabz.invoicegenerator;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {

	Map<Integer, Ride[]> ridesRepository = new HashMap<Integer, Ride[]>();

	public void addUserRides(int userId, Ride[] ridesOfUser) {

		ridesRepository.put(userId, ridesOfUser);
	}

	public Ride[] getUserRides(int userId) {

		return ridesRepository.get(userId);
	}

}
