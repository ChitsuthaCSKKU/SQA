package main;

public class Triangle {

    private final int a, b, c; 

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String classify(int a, int b, int c) {
    	
    	if ((a < b+c) || (b < a+c) || (c < a+b))
    	{	if (a == b && b == c)
            	return "EQUILATERAL";
        	else if (a == b || b == c)
        		return "ISOSCELES";
        	else
        		return "SCALENE";	
    	}
    	else
    		return "Not a triangle";     
    }
}