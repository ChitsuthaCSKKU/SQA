package main;

public class Salary {
	
	public double CalculateSocialInsuranceFee(double salary)
	{	double fee = 0.0;
		if (salary >= 20000)
		{	fee = 1000;			
		}
		else if ((salary >= 15000)&&(salary < 20000))
		{	fee = 800;			
		}
		else 
		{	fee = 750; 
		}
		
		PrintSocialInsuranceFee(fee);
		
		return fee;
	}
	
	public double CalculateOT(double salary, double hour)
	{	double OT = 0.0;
		int rate = 0;
		
		if (salary >= 20000)
		{	rate = 300;			
		}
		else if ((salary >= 15000)&&(salary < 20000))
		{	rate = 250;			
		}
		else 
		{	rate = 200; 
		}
		
		OT = hour*rate;
		
		PrintOT(OT);
		
		return OT;
	}

	public double CalculateTax(double salary, double OT)
	{	double tax = 0.0;
		double income = salary + OT;
		double taxRate = 0.0;
		
		if (income >= 20000)
		{	taxRate = 0.07;			
		}
		else if ((income >= 15000)&&(income < 20000))
		{	taxRate = 0.05;			
		}
		else 
		{	taxRate = 0.03; 
		}
		tax = income*taxRate;
		
		PrintTax(tax);
		
		return tax;
	}
	
	public double CalculateNetSalary(double salary, double extrahour)
	{	double netsalary = 0.0;
		double socialinsurance = CalculateSocialInsuranceFee(salary);
		double OT = CalculateOT(salary, extrahour);
		double tax = CalculateTax(salary, OT);
		
		netsalary = (salary+OT)-tax-socialinsurance;
		
		System.out.println("Net Salary: " + netsalary);
	
		return netsalary;
	}
	
	public void PrintTax(double tax)
	{	System.out.println("Tax: " + tax);		
	}
	
	public void PrintOT(double OT)
	{	System.out.println("Over Time: " + OT);
	}
	
	public void PrintSocialInsuranceFee(double fee)
	{	System.out.println("Social Insurance Fee: " + fee);		
	}

}
