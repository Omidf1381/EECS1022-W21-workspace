package model;

public class Transcript {
	
	private String name;
	private String id;
	private static int counter = 0;
	Registration[] registrations;
	
	
	public Transcript(String string) {
		name = string;
		counter++;
		id = this.name + (counter*3);
		registrations = new Registration[0];
	}
	
	
	public Object getStudentID() {
		return id;
	}
	
	
	public Registration[] getReport() {
		// TODO Auto-generated method stub
		return registrations;
	}


	public void addRegistration(Registration register) {
		Registration[] temp = new Registration[registrations.length+1];
		for (int i=0;i<registrations.length;i++) {
			temp[i]= registrations [i];
		}
		temp[registrations.length]=register;
		registrations = temp;		
	}


	public void addRegistration(String string, int i) {
		Registration r = new Registration(string, i);
		this.addRegistration(r);
	}


	public void addRegistrations(Registration[] registrations2) {
		for (int i=0;i<registrations2.length;i++) {
			this.addRegistration(registrations2[i]);
		}
	}


	public int getMarks(String string) {
		int mark = -1;
		for (int i=0;i<registrations.length;i++) {
			if (registrations[i].getCourseName() == string) {
				mark = registrations[i].getMarks();
			}
		}
		return mark;
	}


	public void setMarks(String string, int i) {
		for (int j=0;j<registrations.length;j++) {
			if (registrations[j].getCourseName() == string) {
				registrations[j].setMarks(i);
			}
		}
	}


	public double getWeightedGPA() {
		// TODO Auto-generated method stub
		return 0;
	}
}
