package com.entities;

import java.time.LocalDate;

public class Flight {

	private String flightNumber;
	private String flightName;
	private String departureTime;
	private String arrivalTime;
	private String source;
	private LocalDate flightdate;
	private String destination;
	private int numberOfSeats;
	private int fare;
	private boolean status;
	private FlightType type;
	public Flight(String flightNumber, String flightName, String departureTime, String arrivalTime, String source,
			LocalDate flightdate, String destination, int numberOfSeats, int fare, FlightType type) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.source = source;
		this.flightdate = flightdate;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.fare = fare;
		this.status = true;
		this.type = type;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public LocalDate getFlightdate() {
		return flightdate;
	}
	public void setFlightdate(LocalDate flightdate) {
		this.flightdate = flightdate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public FlightType getType() {
		return type;
	}
	public void setType(FlightType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", source=" + source + ", flightdate=" + flightdate
				+ ", destination=" + destination + ", numberOfSeats=" + numberOfSeats + ", fare=" + fare + ", status="
				+ status + ", type=" + type + "]";
	}
	
	
}
