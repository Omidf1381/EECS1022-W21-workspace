package model;

public class Participant {
	
	private int list;
	private int regcount ;
	private String partic;
	private Registration[] regiSize;

	
	public Participant(String a1) {
		
		
		
		this.partic = a1;
		this.regcount  = 0;
		this.list = 0;
		this.regiSize = new Registration[0];
		
		
	}

	public void addRegistration(Registration number1) {
		
		this.list += 1;
		Registration[] report = this.regiSize;
		

		if(this.list <=5) {
			this.regiSize = new Registration[this.list];

		}
		
		for(int i=0; i<report.length; i++) {
			
			this.regiSize[i] = report[i];
			}
		
		if(this.list <= 5){
			
			this.regiSize[this.regcount] = number1;
			this.regcount+=1;
		}
	}
	public String getName() {
		return this.partic;
	}
	
	public void addRegistration(String number2) {
		this.list += 1;
		
		Registration[] report = this.regiSize;
		

	if (this.list <=5) {
		this.regiSize = new Registration[this.list];

		}
				
		for(int i=0; i<report.length; i++) {
			this.regiSize[i] = report[i];
			}

		if(this.list <= 5) {
			
		Registration register = new Registration(number2);
		this.regiSize[this.regcount] = register;
		this.regcount+=1;
		}
	}

	public int marksOf(String term) {
		
		if (this.regiSize == null) {
			return -1;
		}
		else {
			
			for (int i=0; i<this.regiSize.length; i++) {
				
				if (this.regiSize[i].getTitle() == term){
					return this.regiSize[i].getMarks();
				}
			}
			return -1;
			}
	}

	public String getGPAReport() {
		
		int sum=0;
		int value=0;
		
		String result = this.partic + "'s GPA of {";
		if (this.regiSize.length == 0) {
			return "No GPA available yet for " + this.partic ;
		}
		else {
			
	for (int i=0; i<this.regiSize.length; i++) {
		
		value += 1;
		sum += this.regiSize[i].getGradepoint();
		
	if (i == this.regiSize.length-1) {
		
		result += this.regiSize[i].getGradepoint() + " ("+this.regiSize[i].getGradeReport()[0]+")}";
				}
			else {
				
	result += this.regiSize[i].getGradepoint() + " ("+this.regiSize[i].getGradeReport()[0]+"), ";
				}
			}
	
			double average = sum/value;
			result += ": " + String.format("%.1f", average);

		}
			return result;
		}	

	public Registration[] getRegistrations() {
		
		return this.regiSize;
	}

	public void updateMarks(String term, int n) {
		
		for (int i=0; i<this.regiSize.length; i++) {
			
			if (this.regiSize[i].getTitle() == term){
				this.regiSize[i].setMarks(n);

			}
		}

	}
	public void clearRegistrations() {
		
		this.list = 0;
		this.regiSize = new Registration[0];
		
		this.regcount= 0;
	}

}

