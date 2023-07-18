package main;

public class CartItem {
	
	private final String product;
	private final int quantity;
	private final double unitPrice;
	private final int percentdiscount; //percentdiscount = 10 -> 10% discount
	
	public CartItem(String product, int quantity, double unitPrice, int percentdiscount) {
		this.product = product;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.percentdiscount = percentdiscount;
	}
	
	//getter

	public String getproduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getPercentDiscount() {
		return percentdiscount;
	}
}
