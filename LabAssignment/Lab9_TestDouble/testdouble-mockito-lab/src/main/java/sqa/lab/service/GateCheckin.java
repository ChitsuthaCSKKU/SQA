package sqa.lab.service;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * Instructor: Asst.Prof. Chitsutha Soomlek
 * 
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GateCheckin {
	
	private Set<Integer> checkinCustomer;
	
	private TicketCounter ticketCounter;
	
	/*
	 * Constructor
	 */
	public GateCheckin(TicketCounter ticketCounter) {
        this.checkinCustomer = new HashSet<Integer>();
        this.ticketCounter = ticketCounter;
    }
	
	/*
	 * A customer can enter a theater when their ticket is checked.
	 */
	public void customerEntry(int ticketId){
        if(customerIsEligible(ticketId)) {
            checkinCustomer.add(ticketId);
            ticketCounter.changeTicketStatus(true);
        }
    }

    public Set<Integer> getPassengersOnBoard() {
        return checkinCustomer;
    }

    public boolean customerIsEligible(int ticketId) {
        return !checkinCustomer.contains(ticketId);
    }

}
