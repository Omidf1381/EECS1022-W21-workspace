package model;

public class Registration {
	


	private String t,inf;
	 private int rawmark;
	 private Instructor i;
	String[] gr = new String[2];


	public Registration(String title) {
		this.t=title;
       
		
		  }

	public Registration(String title, Instructor ins) {
		this.t = title;
		this.i = ins;
		}

	public String getTitle() {
		return this.t;
			}

	public int getMarks() {
		return this.rawmark;
		}

	public Instructor getInstructor() {
		return this.i;
	}

	public String[] getGradeReport() {
	if (rawmark>=0 && rawmark <= 100) {
		if (rawmark > 89) {
	 gr[0] = "A+";
	 gr[1] = "Exceptional";
		}
   else if (rawmark < 90 && rawmark > 79) {
	  gr[0] = "A";
	  gr[1] = "Excellent";
		}
	  else if (rawmark < 80 && rawmark > 69) {
	 gr[0] = "B";
	 gr[1] = "Good";
			}
	else if (rawmark < 70 && rawmark > 59) {
		gr[0] = "C";
		 gr[1] = "Competent";
			}
	else if (rawmark < 60 && rawmark > 49) {
		gr[0] = "D";
		 gr[1] = "Passing";
				}
	else if (rawmark < 50) {
	gr[0] = "F";
	 gr[1] = "Failing";
				}
		}
		return this.gr;
	}

	public String getInformation() {
	if(i!=null) {
	inf = t +", taught by "+i.getName()+", is completed with raw marks "+rawmark+" ("+gr[0]+" ; "+gr[1]+")";
 }
		else{
	inf = "Software Design has not yet been assigned an instructor";
	}
	return inf;

	}

		public void setInstructor(Instructor name) {
		this.i = name;

	}
		
		public int getGradepoint() {
			if (rawmark>=0 &&  rawmark<= 100) {
				if (rawmark > 90) {
			 gr[0] = "Exceptional";
			 gr[1] = "9";
				}
		   else if (rawmark < 89 && rawmark > 80) {
			  gr[0] = "Excellent";
			  gr[1] = "8";
				}
			  else if (rawmark < 70 && rawmark > 79) {
			 gr[0] = "Good";
			 gr[1] = "7";
					}
			else if (rawmark < 60 && rawmark > 69) {
				gr[0] = "Competent";
				 gr[1] = "6";
					}
			else if (rawmark < 50 && rawmark > 59) {
				gr[0] = "Passing";
				 gr[1] = "5";
					}
			else if (rawmark < 0 && rawmark > 49) {
				gr[0] = "Failing";
				 gr[1] = "0";
					}
			
			}
			return 0;
		}

		public void setMarks(int mark) {
		this.rawmark = mark;
	}

			}
