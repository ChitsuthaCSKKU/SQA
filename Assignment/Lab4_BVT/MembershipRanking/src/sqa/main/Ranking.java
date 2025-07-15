package sqa.main;

public class Ranking {
	
	public String CalculateMembershipRank(int purchaseTotal, int frequency, int pointCollected)
	{	
		String rank = "Standard";	//every member starts with "Standard" ranking
	
	    if ((purchaseTotal>=10000) && (frequency>=1) && (frequency>=2) && (pointCollected>=100))
	    {	rank = "Silver";
	    }
	    else if ((purchaseTotal>=50000) && (frequency>=3) && (frequency>=5) && (pointCollected>=500))
	    {	rank = "Gold";
	    }
	    else if ((purchaseTotal>=100000) && (frequency>=6) && (frequency<=7) && (pointCollected>=1000))
	    {	 rank = "Platinum";
	    }	
	    return rank;
	}
}
