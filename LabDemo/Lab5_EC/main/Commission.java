package main;

public class Commission {
	
	final Double PRICE_STOCK = 4500.0;
	final Double PRICE_LOCK = 3000.0;
	final Double PRICE_BARREL = 2500.0;
	
	public Double checkCommission(int num_lock, int num_stock, int num_barrel) {
		
		Double commission = 0.0;
		Double sold_lock = 0.0;
		Double sold_stock = 0.0;
		Double sold_barrel = 0.0;
		
		if ((num_lock < 0)||(num_stock < 0)||(num_barrel < 0)) {
			return -1.0;
		}
		else {
			sold_lock = num_lock*PRICE_LOCK;
			sold_stock = num_stock*PRICE_STOCK;
			sold_barrel = num_barrel*PRICE_BARREL;
			
			Double totalSales = sold_lock + sold_stock + sold_barrel;
			
			if (totalSales > 50000)
			{	commission = (0.1*20000) + (0.15*30000);
				commission = commission + (0.2*(totalSales-50000));
			}
			else if ((totalSales > 20000) && (totalSales < 50000))
			{	commission = 0.1*20000;
				commission = commission + (0.15*(totalSales-20000));
			}
			else if ((totalSales > 10000) && (totalSales < 20000))
			{	commission = 0.1*totalSales;
			}
			else
			{	commission = 0.0;
			}
		}
		
		return commission;
	}
}
