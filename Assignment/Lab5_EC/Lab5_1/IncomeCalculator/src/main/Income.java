package main;

public class Income {
	
	final Double IN_IMPELLER = 10.0;
	final Double IN_MOTOR = 30.0;
	final Double IN_COVER = 20.0;
	
	public Double calculateIncome(int num_impeller, int num_motor, int num_cover) {
		
		Double income = 0.0;
		Double sold_impeller = 0.0;
		Double sold_motor = 0.0;
		Double sold_cover = 0.0;
		
		if ((num_impeller < 1000)||(num_motor < 300)||(num_cover < 500)) {
			return -1.0;
		}
		else {
			sold_impeller = num_impeller*IN_IMPELLER;
			sold_motor = num_motor*IN_MOTOR;
			sold_cover = num_cover*IN_COVER;
			
			income = sold_impeller+sold_motor+sold_cover;
		}

		return income;
	}
}
