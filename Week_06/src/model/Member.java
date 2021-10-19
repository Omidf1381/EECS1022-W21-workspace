package model;


public class Member {
// private is only accessible within the class
	private int id; //123456,
	private char type;  //e.g. for silver, 'b' for bronze
	private double balance;
	
	private String name;
	
	
	private double weight;
	private double height;


	public Member() {
		
	}
	
	
public Member(int id, char type, double balance) {
 this.id = id;
 this.type = type;
 this.balance = balance;
}
