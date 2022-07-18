package main;

public class Membership {
	
	public int calculatePoint(int purchase, int invitefriend, int joinevent) {
		int totalPoint = 0;
		if ((purchase >= 0) && (invitefriend >= 0) && (joinevent >= 0)) {
			totalPoint = purchase + invitefriend + joinevent;
		}
		else {
			totalPoint = -1;   //this should not happen
		}
		
		return totalPoint;
	}
	
	public String checkMembershipStatus(int point) {
		String status = "";
		
		if (point >= 100) {
			status = "Platinum";
		}
		else if ((point >= 75) && (point < 100)) {
			status = "Gold";
		}
		else if ((point >= 50) && (point < 75)) {
			status = "Silver";
		}
		else if ((point > 25) && (point < 50)) {
			status = "Copper";
		}
		else if ((point >= 0) && (point < 25)) {
			status = "Zinc";
		}
		else {
			status = "Invalid";
		}
		
		return status;
	}

}
