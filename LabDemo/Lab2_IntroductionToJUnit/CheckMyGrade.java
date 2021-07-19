package labdemo.main;

public class CheckMyGrade {
	public int CalculateTotalPoint(int pointMidterm, int pointFinal, int pointCollected)
	{	int totalPoint = 0;
	    if ((pointMidterm>=0) && (pointFinal>=0) && (pointCollected>=0))
	    {	totalPoint = pointMidterm + pointFinal + pointCollected;
	    }
	    
		return totalPoint;		
	}
	
	public String CalculateGrade(int point)
	{	String grade = "";
		
		if (point >= 80)
		{	grade = "A";			
		}
		else if ((point>=75) && (point<80))
		{	grade = "B+";
		}
		else if ((point>=70) && (point<75))
		{	grade = "B";
		}
		else if ((point>=65) && (point<70))
		{	grade = "C+";
		}
		else if ((point>=60) && (point<65))
		{	grade = "C";
		}
		else if ((point>=55) && (point<60))
		{	grade = "D+";
		}
		else if ((point>=50) && (point<55))
		{	grade = "D";
		}
		else
		{	grade = "F";			
		}
		
		return grade;
	}

}
