package test.model;

public class Flight {

	private int fliteNumber;
	private String departurePort;
	private String arrivalPort;
	private int  departureTime;
	private int  arrivalTime;
	public int getFliteNumber() {
		return fliteNumber;
	}
	public void setFliteNumber(int fliteNumber) {
		this.fliteNumber = fliteNumber;
	}
	public String getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	public String getArrivalPort() {
		return arrivalPort;
	}
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return "Flight [fliteNumber=" + fliteNumber + ", departurePort=" + departurePort + ", arrivalPort="
				+ arrivalPort + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
}
