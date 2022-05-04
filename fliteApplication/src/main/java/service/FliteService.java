package service;

import java.util.List;

import model.Flights;

public interface FliteService {

	public Flights getFlightFromFlightNumber(int id);

	public List<Flights> getAllFlights();
}
