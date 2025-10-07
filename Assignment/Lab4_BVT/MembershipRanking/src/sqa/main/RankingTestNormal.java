package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class RankingTestNormal {

	// purchaseTotal 
    @Test
    void PurchaseTotal_Min() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(10000, 3, 500);
        assertEquals("Silver", result);
    }

    @Test
    void PurchaseTotal_MinPlus() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(10001, 3, 500);
        assertEquals("Silver", result);
    }

    @Test
    void PurchaseTotal_MaxMinus() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(99999, 3, 500);
        assertEquals("Gold", result);
    }

    @Test
    void PurchaseTotal_Max() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(100000, 3, 500);
        assertEquals("Platinum", result);
    }

    // frequency 
    @Test
    void Frequency_Min() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 1, 500);
        assertEquals("Silver", result);
    }

    @Test
    void Frequency_MinPlus() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 2, 500);
        assertEquals("Silver", result);
    }

    @Test
    void Frequency_MaxMinus() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 5, 500);
        assertEquals("Gold", result);
    }

    @Test
    void Frequency_Max() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 6, 500);
        assertEquals("Platinum", result);
    }

    // pointCollected 
    @Test
    void PointCollected_Min() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 3, 100);
        assertEquals("Silver", result);
    }

    @Test
    void PointCollected_MinPlus() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 3, 101);
        assertEquals("Silver", result);
    }

    @Test
    void PointCollected_MaxMinus() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 3, 999);
        assertEquals("Gold", result);
    }

    @Test
    void PointCollected_Max() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 3, 1000);
        assertEquals("Platinum", result);
    }

    // Nominal case
    @Test
    void All_Nominal() {
        Ranking ranking = new Ranking();
        String result = ranking.CalculateMembershipRank(50000, 3, 500);
        assertEquals("Gold", result);
    }


}
