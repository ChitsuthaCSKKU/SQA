package main;

public class TVPlan {
	
	static final double FAMILY_SHARING_SERVICE = 150;
	static final double INTL_REGION_SERVICE = 200;
	static final double DISCOUNT = 50;
	
	private final boolean family_sharing, intlregion, discount;
	
	public TVPlan(boolean family_sharing, boolean intlregion, boolean discount) {
		this.family_sharing = family_sharing;
		this.intlregion = intlregion;
		this.discount = discount;
	}
	
	public enum TVPackage {
		BASIC, STANDARD, PREMIUM;
		
		public double getPrice() {
			switch(this) {
			case BASIC:
				return 250;
			case STANDARD:
				return 350;
			case PREMIUM:
				return 450;
			default:
				return 0;
			}
		}
	}
	
	double pricePerMonth(TVPackage selectedPackage) {
		double totalPrice = 0;
		double basePrice = selectedPackage.getPrice();
		double extracost = 0;
		double reducecost = 0;
		
		extracost = family_sharing ? extracost + FAMILY_SHARING_SERVICE: extracost;
		extracost = intlregion ? extracost + INTL_REGION_SERVICE : extracost;
		reducecost = discount ? reducecost + DISCOUNT : extracost;
		
		totalPrice = basePrice + extracost - reducecost;
		
		return totalPrice;
	}
}
