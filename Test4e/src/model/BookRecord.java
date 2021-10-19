package model;

public class BookRecord {

	String booktitle;
	int bookcopy;
	Shelf locatedshelf;
	static int bookcounter = 1;
	String bookid;
	
							
	public BookRecord(String string, int i, Shelf s1) {
		
		booktitle = string;
		bookcopy = i;
		locatedshelf = s1;
		bookid = s1.getID() + "-"+string+"-"+bookcounter;
		bookcounter++;
		
					}
	public String getTitle() {
		
		return booktitle;
	}
	
	public int getNumberOfCopies() {
		
		return bookcopy;
	}

	public Shelf getShelf() {
		return locatedshelf;
	}

	public Object getID() {
		return bookid;
	}

}
