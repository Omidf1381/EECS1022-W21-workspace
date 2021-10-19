package model;

public class Repository {

	
	private int item1;
	 private Item[] items;
	 private int nor;
	 
	 private int item2;


	public Repository(int i) {   
		
		this.items = new Item[i];
		this.item1=i;
		this.item2=i;
		this.nor = 0;

	}
	public Item[] getItems() {
		
		Item[] result = new Item[this.nor];
		
		for(int i =0; i<this.nor;i++) {
			result[i] = this.items[i];
		}
		return result;
	}

	
	
		public Item[] getItemsOutsideRange(int i, int j) {
			
			return null;
		}
		
		public int getAmount(String string) {
			return 0;
		}
		public void addItem(Item i1) {
			
		}
		public void decreaseAmount(String string, int i) {
			
		}
		
	public Item[] getItems(String[] titles) {
			
		Item[] result = new Item[this.nor];
			
		return result;
	}	
		
}
