package sqa;

public class PhonePlan {
	
	static final double INTER_SERVICE = 400;
	static final double SMS_SERVICE = 100;
	static final double DISCOUNT = 20;
	
	private final boolean international, sms, discount;

    public PhonePlan(boolean international, boolean sms, boolean discount) {
        this.international = international;
        this.sms = sms;
        this.discount = discount;
    }

    double pricePerMonth(double basePrice) {
        double totalPrice = basePrice;
        double extracost = 0;
        
        extracost = international ? extracost+ INTER_SERVICE : extracost;
        extracost = sms ? extracost+ SMS_SERVICE : extracost;
        extracost = discount ? extracost-DISCOUNT : extracost;
        
        totalPrice = basePrice + extracost;
        
        return totalPrice;
    }
}
