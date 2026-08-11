package sqa.lab.service;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * Instructor: Asst.Prof. Chitsutha Soomlek
 * 
 */

public class TicketCounter {
	
	private Integer noCheckinCustomer = 0;
	
	public void changeTicketStatus(boolean isValidTicket) {
		
		if (isValidTicket) {
			noCheckinCustomer++;
		}			
	}
	
	public int getNoCheckinCustomer() {
		return noCheckinCustomer;
	}
	
	public void resetNoCheckinCustomer() {
		noCheckinCustomer = 0;
	}

}
