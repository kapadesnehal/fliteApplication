package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import model.Flights;
import service.FliteService;

@Component
public class FlightDaoService implements FliteService {
private static List<Flights> flights = new ArrayList<>();

/* private static int flightcont = 5; */

static {
	flights.add(new Flights(100001,"Nashik","Pune",12-00-00,02-00-00));
	flights.add(new Flights(100002,"Pune","Mumbai",12-00-00,02-00-00));
	flights.add(new Flights(100003,"Mumbai","Delhi",12-00-00,02-00-00));
	flights.add(new Flights(100004,"Mumbai","Singapore",12-00-00,02-00-00));
	flights.add(new Flights(100005,"Mumbai","Vizag",12-00-00,02-00-00));
}

//To get list of flights
public List<Flights> getAllFlights()
{
	return flights;
}

//To get Flight from its flightNumber
public Flights getFlightFromFlightNumber(int id) {
	for(Flights flight:flights) {
		
		if(flight.getFliteNumber() == id) {
			return flight;
		}
	}
	return null;
}
	
}
