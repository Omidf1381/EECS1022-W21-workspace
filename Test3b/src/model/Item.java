package model;

public class Item {

	String title;
	String info;
	int amount=0;

		public Item(String string) {
	this.title = string;
	}

		public Item() {
			}

	public String getTitle() {
	return this.title;
				}

	public int getAmount() {
     	if (amount>0) {
	return amount;
	}
	else {
	return 0;
	}
	}

	public String getInfo() {
	if (title != null) {

	return "Item: "+this.title+" ("+amount+")";
	}

	else {
	return "Error: non-positive amount "+amount+"";
	}
	}
	

	public void increaseAmount(int i) {
			this.amount =amount + i;
		}

	public void decreaseAmount(int i) {
			this.amount =amount - i;
				}

	}