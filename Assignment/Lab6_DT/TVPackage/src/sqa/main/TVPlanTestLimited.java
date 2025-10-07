package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TVPlanTestLimited {


	@ParameterizedTest
	@CsvSource({
	    // S, P, F, Offline, Live, Yearly, Expected Fee
	    "Standard,false,false,false,false,false,150",
	    "Standard,false,false,false,false,true,100",
	    "Standard,false,false,false,true,false,250",
	    "Standard,false,false,false,true,true,200",
	    "Standard,false,false,true,false,false,250",
	    "Standard,false,false,true,false,true,200",    
	    "Standard,false,false,true,true,false,350",	 	    
	    "Standard,false,false,true,true,true,300",

	    "false,Premium,false,false,false,false,350",
	    "false,Premium,false,false,false,true,300",
	    "false,Premium,false,false,true,false,450",
	    "false,Premium,false,false,true,true,400",
	    "false,Premium,false,true,false,false,450",
	    "false,Premium,false,true,false,true,400",
	    "false,Premium,false,true,true,false,550",    	    
	    "false,Premium,false,true,true,true,500",

	    "false,false,Family,false,false,false,450",
	    "false,false,Family,false,false,true,400",
	    "false,false,Family,false,true,false,550",
	    "false,false,Family,false,true,true,500",
	    "false,false,Family,true,false,false,550",
	    "false,false,Family,true,false,true,500",
	    "false,false,Family,true,true,false,650",  
	    "false,false,Family,true,true,true,600",
	    

	    
	})
	void testLimitedEntryDecisionTable(
	    String s, String p, String f,
	    boolean offline, boolean live, boolean yearly, int expectedFee
	) {
	    String packageType;
	    if (s.equals("Standard")) packageType = "Standard";
	    else if (p.equals("Premium")) packageType = "Premium";
	    else packageType = "Family";

	    TVPlan.TVPackage selectedPackage = TVPlan.TVPackage.valueOf(packageType.toUpperCase());
	    TVPlan plan = new TVPlan(offline, live, yearly);
	    double actualFee = plan.pricePerMonth(selectedPackage);
	    assertEquals(expectedFee, actualFee);
	}

}
