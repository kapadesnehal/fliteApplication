package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Flights;

@RestController
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	private FliteService flightService;
	
	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);
	
	
	@GetMapping
	public List<Flights> retriveAllFlights(){
		return flightService.getAllFlights();
	}
	
	@GetMapping("/{flightNumber}")
	public @ResponseBody Flights getFlightFromFlightNumber(@PathVariable("flightNumber") int flightNumber) {
		return flightService.getFlightFromFlightNumber(flightNumber);
	}

}
