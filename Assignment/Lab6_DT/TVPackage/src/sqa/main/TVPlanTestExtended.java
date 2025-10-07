package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TVPlanTestExtended {

    @ParameterizedTest
    @CsvSource({
        // Package, Offline, Live, Yearly, Expected Fee
        "Standard,false,false,false,150", 
        "Standard,false,false,true,100",
        "Standard,false,true,false,250",
        "Standard,false,true,true,200",
        "Standard,true,false,false,250",
        "Standard,true,false,true,200",
        "Standard,true,true,false,350",
        "Standard,true,true,true,300",
        
        
        "Premium,false,false,false,350",
        "Premium,false,false,true,300",
        "Premium,false,true,false,450",
        "Premium,false,true,true,400",
        "Premium,true,false,false,450",
        "Premium,true,false,true,400",
        "Premium,true,true,false,550",
        "Premium,true,true,true,500",

        
        "Family,false,false,false,450",
        "Family,false,false,true,400",
        "Family,false,true,false,550",
        "Family,false,true,true,500",
        "Family,true,false,false,550",
        "Family,true,false,true,500",
        "Family,true,true,false,650",
        "Family,true,true,true,600"
    })
    void testCalculateMonthlyFee(String packageType, boolean offline, boolean live, boolean yearlyContract, int expectedFee) {
        TVPlan.TVPackage selectedPackage = TVPlan.TVPackage.valueOf(packageType.toUpperCase());
        TVPlan plan = new TVPlan(offline, live, yearlyContract);
        double actualFee = plan.pricePerMonth(selectedPackage);
        assertEquals(expectedFee, actualFee);
    }
}
