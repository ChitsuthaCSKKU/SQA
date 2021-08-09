package main;

public class ThaiFruitPacking {
	
	public static final int CANNOT_PACK_BAG = -1;

    public int calculate(int smallSize, int largeSize, int total) {
        int maxLargePacks = total / 5;
        int largePacksWeCanUse = Math.min(maxLargePacks, largeSize);
        total -= (largePacksWeCanUse * 5);

        if(smallSize < total)
            return CANNOT_PACK_BAG;
        return total;

    }
}
