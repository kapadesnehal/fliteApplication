package test.model;

import org.junit.jupiter.api.Test;

public class Flightutil {

	@Test
	public void getAllFlights() {
		System.out.println("List of all Flights");
	}
	
	@Test
	public int getFlightFromFlightNumber(int id) {
		
		System.out.println("Flight for given flightNumber");
		return id;
	}
}
