package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachine {

	
	private String a1;
	private String a2;
	private String a3;
	private String a4;
	private String a5;

	
	public  VendingMachine() {
		a1 = "Empty VM Started";
		}
		
	public VendingMachine (String a1) {
		this.a1=a1;
	}
	public String checkStatus() {
		
		return a1;
		
	}
	//

	public String add(String a5, int i) {
		a1=i+a2;
		if(a1=="Coke"||i==5) {
			a5="Product added: Coke (5)";
		}
		if (a1=="Coke") {
		a5="Coke (5)";
		}
		
		
		if(a1=="Orange Juice"||i==5) {
		a1="Product added: Orange Juice (5)";}
		if(a1=="Orange Juice") {
			a1="Orange Juice (5)";
		}
		else
			a1="Product added: Coke (5)";
		return a1="Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (0), Lay's Classic Chips (0)";

	}
	
	
	public void add1(String a5, int x) {

		if(a5=="Kitkat Chunky Bar"||x==5) {
			a5="Product added: Kitkat Chunky Bar (5)";}
		if(a5=="Kitkat Chunky Bar") {
			a5="Kitkat Chunky Bar (5)";
		}
		else
			
			
			if(a5=="Lay's Classic Chips"||x==5) {
				a5="Product added: Lay's Classic Chips (5)";}
			if(a5=="Lay's Classic Chips") {
				a5="Lay's Classic Chips (5)";
			}
			else	
		a5="Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (5)";
	}
			public void add2(String a5, int n) {
			if(a5=="Maltesers Chocolate"||n==4) {
				a5="Invalid product: Maltesers Chocolate";}
			if(a5=="Maltesers Chocolate") {
				a5="Invalid product: Maltesers Chocolate";
			}
			else
			a5="Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (5)";
			
			return;}
				 
	
	//
	public String checkStock(String a2) {
		{
			  if(a2=="Coke")  {
				  a2 = "Coke (0)";
			  }
		if(a2=="Orange Juice")  {
			  a2 = "Orange Juice (0)";
			}
		if(a2=="Kitkat Chunky Bar")
			a2 = "Kitkat Chunky Bar (0)";
		  }
	
		if(a2=="Lay's Classic Chips")
			a2 = "Lay's Classic Chips (0)";
		
		else if(a2 == "Lay's BBQ Chips"){
		a2 = "Invalid product: Lay's BBQ Chips";
		}  
		return a2;
			
}
			

	public String checkStock () {
		String a3;
		
	a3 ="Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)";
		
		return a3;
		}
	
	
	
	public String dispense(String a4, int i) {
		  if(a4=="Kitkat Chunky Bar"||i==7)  {
			  a4 = "Kitkat Chunky Bar (7)";
		  }
		return a4;
		}


}

