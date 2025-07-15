package sqa.main;

public class TriangleEnum {

    private final int a, b, c;
    
    public TriangleEnum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public enum TriangleType {
        EQUILATERAL, ISOSCELES, SCALENE, NOTATRIANGLE;
        
        public String getName() {
		    switch(this) {
		      case EQUILATERAL:
		        return "Equilateral";

		      case ISOSCELES:
		        return "Isosceles";

		      case SCALENE:
		        return "Scalene";

		      case NOTATRIANGLE:
		        return "NotATriangle";

		      default:
		        return null;
		      }
		}
    }

    public TriangleType classify() {
    	
    	if ((a < b+c) || (b < a+c) || (c < a+b))
    	{	if (a == b && b == c)
            	return TriangleType.EQUILATERAL;
        	else if (a == b || b == c)
        		return TriangleType.ISOSCELES;
        	else
        		return TriangleType.SCALENE;	
    	}
    	else
    		return TriangleType.NOTATRIANGLE;     
   }
    
   public String showResult(TriangleType type) {
	   return type.getName();
   }
}
