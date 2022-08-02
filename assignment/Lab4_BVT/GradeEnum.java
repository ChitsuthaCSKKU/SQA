package main;

public class GradeEnum {
	
	private final int score_sectionA, score_sectionB, score_final;
	
	public GradeEnum(int score_sectionA, int score_sectionB, int score_final) {
		this.score_sectionA = score_sectionA;
		this.score_sectionB = score_sectionB;
		this.score_final = score_final;
	}
	
	
	public enum GradeType {
		F, D, C, B, A;
		
		public String getName() {
			switch(this) {
			case A:
				return "Outstanding";
			case B:
				return "Excellent";
			case C:
				return "Good";
			case D:
				return "Pass";
			case F:
				return "Fail";
			default:
				return null;
			}
		}
	}
	
	public GradeType classify() {
		
		if ((score_sectionA != 0) || (score_sectionB !=0) || (score_final != 0 ))  {
			int total_score = score_sectionA + score_sectionB + score_final;
			
			if ((total_score >= 50) && (total_score < 60))
				return GradeType.D;
			else if ((total_score >= 60) && (total_score < 70))
				return GradeType.C;
			else if ((total_score >= 70) && (total_score < 80))
				return GradeType.B;
			else if ((total_score >= 80) && (total_score < 100))
				return GradeType.A;
			else
				return GradeType.F;						
		}
		else
			return GradeType.F;
	}
	
	public String showResult(GradeType type) {
		return type.getName();
	}
	
}
