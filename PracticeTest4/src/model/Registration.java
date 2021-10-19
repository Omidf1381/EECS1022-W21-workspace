package model;

public class Registration {

	private String courseName;
	private String letterGrade; 
	private int credit;
	private int wieghtedgrade;
	private int mark;
	
	public Registration(String string, int i, int j) {
		this.courseName = string;
		this.credit = i;
		this.mark = j;
	}
	public Registration(String string, int i) {
		this.courseName = string;
		this.credit = i;
		this.mark = 0;
	}
	public Object getCourseName() {
		return this.courseName;
	}
	public int getNumberOfCredits() {
		return this.credit;
	}
	public int getMarks() {
		return this.mark;
	}
	public void setMarks(int i) {
		this.mark = i;
	}
	public Object getLetterGrade() {
		if (mark>= 90) {
			this.letterGrade = "A+";
		}
		else if (80 <= mark  && mark <  90) {
			this.letterGrade = "A";
		}
		else if (70 <= mark  && mark <  80) {
			this.letterGrade = "B";
		}
		else if (60 <= mark  && mark <  70) {
			this.letterGrade = "C";
		}
		else if ( 50 <= mark  && mark <  60) {
			this.letterGrade = "D";
		}
		else if (mark < 50) {
			this.letterGrade = "F";
		}
		return this.letterGrade;
	}
	
	public int getWeightedGradePoint() {
		
		this.getLetterGrade();
		
		switch (this.letterGrade) {
		case "A+":
			this.wieghtedgrade = this.credit* 9;
			break;
			
		case "A":
			this.wieghtedgrade = this.credit* 8;
			break;
			
		case "B":
			this.wieghtedgrade = this.credit* 7;
			break;
			
		case "C":
			this.wieghtedgrade = this.credit* 6;
			break;
			
		case "D":
			this.wieghtedgrade = this.credit* 5;
			break;
			
		case "F":
			this.wieghtedgrade = this.credit* 0;
			break;
		}
		
		
		return wieghtedgrade;
	}

}