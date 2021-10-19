package model;

public class Shelf {
	
	int shelfcap;
	String shelfid;
	static int idcounter = 5;
	int bookrecords = 0;
	int bookcopies = 0;          
	String status;								
	BookRecord [] books;
	String [] bookstrings;
	String bookstring = "" ;											
	
	public Shelf(int i) {
		
		shelfcap = i;
		shelfid = "Shelf-"+idcounter;
		idcounter = idcounter+4;
			
	}

	public String getID() {
		
	return this.shelfid;
	}

	public int getNumberOfBookRecords() {
		return bookrecords;
	}

	public int getNumberOfBookCopies() {
		return bookcopies;
	}

	public String getStatus() {
		for(int i = 0; i < books.length; i++) {
			bookstrings[i] = books[i].getTitle() + "("+books[i].getNumberOfCopies()+")";}
		bookstring = bookstrings[0];
		for (int i = 1; i < bookstrings.length; i++) {
		bookstring =","+bookstring+bookstrings[i] ;
		}
		status = bookrecords + " records and " + bookcopies +" copies: "+"{"+bookstring+"}";

		return status;
	}

	public void addBookRecord(BookRecord r1) {
		bookcopies = bookcopies + r1.getNumberOfCopies();
		books[bookrecords] = r1;
		bookrecords++;		
	}

}
