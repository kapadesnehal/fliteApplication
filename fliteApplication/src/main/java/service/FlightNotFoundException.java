package service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightNotFoundException extends RuntimeException{

	public FlightNotFoundException(String message) {
		
		super(message);
	}
}
