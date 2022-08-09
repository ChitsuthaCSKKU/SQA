package main;

public class ShippingPackage {
	
	public static final int CANNOT_PACK_ITEM = -1;

    public int calculate(int smallSize, int largeSize, int total) {
        int maxLargePacks = total / 5;
        int largePacksWeCanUse = Math.min(maxLargePacks, largeSize);
        total -= (largePacksWeCanUse * 5);

        if(smallSize < total)
            return CANNOT_PACK_ITEM;
        return total;

    }
}
