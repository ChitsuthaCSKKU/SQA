package main;

import java.util.ArrayList;
import java.util.List;

public class ShippingVehicle {
	
	public static final int CANNOT_SHIP_ITEM = -1;

    public List<Integer> calculate(int smallSize, int mediumSize, int largeSize) {
    	
    	List<Integer> shiplist = new ArrayList<Integer>();
    	int total = smallSize + mediumSize + largeSize;
        int maxLargeBoxes = total / 10;
        int largeBoxesWeCanShip = Math.min(maxLargeBoxes, largeSize);
        
        shiplist.add(largeBoxesWeCanShip);
        total -= (largeBoxesWeCanShip * 10);

        if(mediumSize < total) {
        	shiplist.add(CANNOT_SHIP_ITEM);
            return shiplist;
        }
        else {
        	int maxMediumBoxes = total / 5;
        	int mediumBoxesWeCanShip = Math.min(maxMediumBoxes, mediumSize);
        	shiplist.add(mediumBoxesWeCanShip);
        	total -= (mediumBoxesWeCanShip * 5);
        }
        
        if(smallSize < total){
        	shiplist.add(CANNOT_SHIP_ITEM);
            return shiplist;
        }
        else {
        	shiplist.add(total);
        }
        
        return shiplist;
    }
}
