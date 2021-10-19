package model;

public class Customer {
	
	
	private String name;
	 private double balance;
	 
	 private Record[] records;
	 private int nor;
	
	public Customer(String name, double balance) {
		this.name=name;
		this.balance=balance;
		this.records = new Record[30];
		this.nor = 0;
	}

	
	public Customer(String s) {
		this.name=s;
		this.records = new Record[30];
		this.nor = 0;
	}



	public String getName() {
		
		
		return this.name;
	}

	public double getBalance() {
		
		return this.balance;
	}
	
	public Record[] getRecords() {
		
		Record[] result = new Record[this.nor];
		
		for(int i =0; i<this.nor;i++) {
			result[i] = this.records[i];
		}
	
		return result;
	}
	

	public double getAmountDue() {
		      
		double amount = 0;
		
		for(int i = 0; i<this.nor;i++) {
			Record r = this.records[i];
			amount += r.getPrice()*r.getQuantity();
		}
		return amount;
	}

	public void deposit(double d) {
			this.balance += d;
	}
	
	//
	public void withdraw(double d) {
		this.balance -= d;
	}
	//

	public void addRecord(Record r) {
		
		
		this.records[this.nor]=r;
		this.nor ++;
		
	}

	public void addRecord(String s, double d, int i) {
		
//		Record r = new Record(s ,d ,i);
//			this.records[this.nor]=r;
//			this.nor ++;
			
			this.addRecord(new Record(s ,d ,i));
		}
	public void addRecords(Record[] orders) { //Assumption: this.nor + order.length <= 30
		for(int i =0; i<orders.length;i++) {
//			Record r = orders[i];
//			this.records[this.nor]=r;
//			this.nor++;
			this.addRecord(orders[i]);
		}
	}



	public Record[] getRecordsLargerThan(int amount) { // also refered to getPointInQuadrant1() in written notes
		int count = 0; // size of written array
		Record[] temp = new Record[this.nor];
		for(int i =0; i<this.nor;i++) {
			Record r = this.records[i];
			if(r.getPrice()*r.getQuantity()>amount) {
				temp[count] = r;
				count ++;
			}
		}
			Record[] result = new Record[count];
			for(int i =0;i<count;i++) {
				result[i]= temp[i];
			}
			return result;
	}
	public void clear(){
			this.records = new Record[30];
			this.nor = 0;
	}
	
}
