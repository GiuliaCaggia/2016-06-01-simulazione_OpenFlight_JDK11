package it.polito.tdp.flight.db;

import java.util.List;

import it.polito.tdp.flight.model.Airport;

public class TestDAO {

	public static void main(String args[]) {
		FlightDAO dao = new FlightDAO() ;
		
		List<Airport> arps = dao.getAllAirports() ;
		System.out.println(arps);
	}
	
}
