package junit_tests;

import model.*; /* Only classes created in the `model` package will be graded. */

import static org.junit.Assert.*;
import org.junit.Test;

/* Problem:
 * 
 * You are required to build classes for managing a library,
 * 	 where records of available books are stored in different shelves. 
 * 
 * A library stores up to 50 shelves.
 * 
 * Each shelf stores a collection of book records.
 * When first created, a shelf is set with a capacity 
 * (i.e., maximum total number of book copies). 
 * 
 * Each book record is characterized by its title, number of available copies, and located shelf.
 * You can assume that within a shelf, there are no two book records with the same title. 
 * 
 * A shelf's status is a summary of its stored book records. 
 * 	However, if the last invoked mutator resulted in an error (e.g., due to insufficient space on the shelf), 
 * 	then the shelf's status should be updated to the corresponding error message.
 * 
 * For other functionalities, details, and examples, see below for the test methods and in-line comments.
 */

public class Tests {
	
	/*
	 * Programming Requirements:
	 * 	- You are only allowed to use primitive arrays (e.g., int[], String[], Facility[]) 
	 * 		for declaring attributes and implementing methods.
	 * 	- Any use of a Java library class or method is forbidden 
	 * 		(that is, use selections and loops to build your solution from scratch instead):
	 * 	- Here are some examples of forbidden classes/methods: 
	 * 		- Arrays class (e.g., Arrays.copyOf)
	 * 		- System class (e.g., System.arrayCopy)
	 * 		- ArrayList class
	 * 		- String class (e.g., substring).
	 * 	- The use of some library classes does not require an import statement, 
	 * 		but these classes are also forbidden to be used.
	 * 	- Here are the exceptions (library methods which you are allowed to use if needed):
	 * 		- String class (equals, format)
	 * 
	 * You will receive an immediate zero if this requirement is violated.
	 */
	
	/*
	 * Your expected workflow should be:
	 * Step 1: Eliminate compilation errors. 
	 * 	Declare all the required classes and methods (returning default values if necessary), 
	 * 	so that the project contains no compilation errors (i.e., no red crosses shown on the Eclipse editor).
	 * Step 2: Pass all unit tests. Add private attributes and complete the method implementations accordingly, 
	 * 	so that executing all tests result in a green bar.
	 * 
	 * If necessary, you are free to declare (private or public) helper methods.
	 * 
	 * Any new classes that are ***not*** indicated by the given JUnit tests will be ***disregarded*** in grading. 
	 */
	
	@Test
	public void test_01() {
		/* Create empty shelves which can store 
		 * up to the specified maximum numbers of book copies. 
		 */
		Shelf s1 = new Shelf(10);
		Shelf s2 = new Shelf(9);
		Shelf s3 = new Shelf(7);
		Shelf s4 = new Shelf(11);
		
		/* The id of each shelf has the form "Shelf-?",
		 * where ? is an integer. The integer part of all shelf id's should form 
		 * the following arithmetic sequence (with a common difference): 5, 9, 13, 17, 21, ... 
		 */
		assertEquals("Shelf-5", s1.getID());
		assertEquals("Shelf-9", s2.getID());
		assertEquals("Shelf-13", s3.getID());
		assertEquals("Shelf-17", s4.getID());
		
		/* The id of a shelf, once assigned, never changes. */
		assertEquals("Shelf-5", s1.getID());
		assertEquals("Shelf-9", s2.getID());
		assertEquals("Shelf-13", s3.getID());
		assertEquals("Shelf-17", s4.getID()); 
		
		/* Create a new book record with the specified title, number of copies, and located shelf.
		 * 
		 * Assumption: The passed argument values for title, number of copies, and shelf object
		 * are always valid (i.e., no error checking is needed).  
		 */
		BookRecord r1 = new BookRecord("Romeo and Juliet", 4, s1);
		BookRecord r2 = new BookRecord("Hamlet", 3, s2);
		BookRecord r3 = new BookRecord("The Tempest", 2, s3);
		BookRecord r4 = new BookRecord("King Lear", 1, s4);
		
		/* Get the title of each book. */
		assertEquals("Romeo and Juliet", r1.getTitle()); 
		assertEquals("Hamlet", r2.getTitle());
		assertEquals("The Tempest", r3.getTitle());
		assertEquals("King Lear", r4.getTitle());
		
		/* Get the number of available copies of each book. */
		assertEquals(4, r1.getNumberOfCopies());
		assertEquals(3, r2.getNumberOfCopies());
		assertEquals(2, r3.getNumberOfCopies());
		assertEquals(1, r4.getNumberOfCopies());
		
		/* Get the located shelf of each book. */
		Shelf r1Shelf = r1.getShelf();
		assertTrue(r1Shelf == s1);
		assertTrue(r2.getShelf() == s2);
		assertTrue(r3.getShelf() == s3);
		assertTrue(r4.getShelf() == s4);
		
		/* The id of each book record consists of three parts (separated by dashes):
		 * 1. The id of its located shelf (assumed to be non-null)
		 * 2. The title of the book
		 * 3. An integer indicating the chronological order in which the book record was created.
		 * 	  e.g., 1 for the first created book record, 2 for the second created book record, etc. 
		 */
		assertEquals("Shelf-5-Romeo and Juliet-1", r1.getID());
		assertEquals("Shelf-9-Hamlet-2", r2.getID());
		assertEquals("Shelf-13-The Tempest-3", r3.getID());
		assertEquals("Shelf-17-King Lear-4", r4.getID()); 
		
		/* The id of a book record, once assigned, never changes. */
		assertEquals("Shelf-5-Romeo and Juliet-1", r1.getID());
		assertEquals("Shelf-9-Hamlet-2", r2.getID());
		assertEquals("Shelf-13-The Tempest-3", r3.getID());
		assertEquals("Shelf-17-King Lear-4", r4.getID()); 
	}
	
	@Test
	public void test_02() {
		/* Create an an empty shelf that can store up to 
		 * the specified number of book copies.
		 */
		Shelf s1 = new Shelf(10);
		
		/* Note the distinction between book records and book copies:  
		 * 	- A shelf stores a collection of book ***records***. 
		 * 	- Each book record indicates the number of ***copies*** available for that book.
		 */
		assertEquals(0, s1.getNumberOfBookRecords());
		assertEquals(0, s1.getNumberOfBookCopies());
		
		/* When there was no error resulted from the last mutator call,
		 * 	a shelf's status is a summary of its stored 
		 * 		- number of book records
		 * 		- number of available book copies
		 * 		- a list (surrounded by curly braces) of book titles (indicated with their numbers of available copies). 
		 * 		
		 * Note. Always spell `records` and `copies` in the plural form.
		 * There is no need to say, e.g., 0 record, 1 record, 0 copy, 1 copy. 
		 */
		assertEquals("0 records and 0 copies: {}", s1.getStatus());
		
		BookRecord r1 = new BookRecord("King Lear", 1, s1);
		
		/* Case 1 of adding a book record:
		 * 	Add a new book record (with a non-existing title) to its located shelf.
		 * 
		 * Again: A shelf stores a collection of book records. 
		 * 		  Each book record indicates the number of copies available for that book.
		 * 
		 * In the previous line, r1 was created with its located shelf being set to s1.
		 * In the next line, add r1 to s1's collection of book records.
		 * 
		 * Assume: a book record is always added to its located shelf.   
		 * e.g., r1's located shelf was already set to s1 when it was created,
		 * 			and the following line adds r1 to s1.
		 */
		s1.addBookRecord(r1);
		
		/* Note again the distinction between book records and book copies:  
		 * 	- A shelf stores a collection of book ***records***. 
		 * 	- Each book record indicates the number of ***copies*** available for that book.
		 */
		assertEquals(1, s1.getNumberOfBookRecords()); /* 1 book record: r1 */
		assertEquals(1, s1.getNumberOfBookCopies()); /* 1 book copy, calculated from what r1 indicates */
		
		/* In the list {...}, each book title is indicated with its number of available copies. */
		assertEquals("1 records and 1 copies: {King Lear (1)}", s1.getStatus());
		
		/* Note: r2 is 1 book record indicating 4 copies available for that book. */
		BookRecord r2 = new BookRecord("Romeo and Juliet", 4, s1);
		s1.addBookRecord(r2);
		assertEquals(2, s1.getNumberOfBookRecords()); /* 2 book records: r1 and r2 */
		assertEquals(5, s1.getNumberOfBookCopies()); /* 5 book copies, calculated from what r1 and r2 indicate */
		
		/* Note the spaces after the colon and comma, and the spaces before the opening parentheses. */
		assertEquals("2 records and 5 copies: {King Lear (1), Romeo and Juliet (4)}", s1.getStatus());
	}
	
	@Test
	public void test_03() {
		/* Create an empty shelf which can store 
		 * up to the specified maximum number of book copies. 
		 */
		Shelf s1 = new Shelf(10);
		 
		BookRecord r1 = new BookRecord("Hamlet", 7, s1); 
		BookRecord r2 = new BookRecord("King Lear", 3, s1); 
		s1.addBookRecord(r1);
		s1.addBookRecord(r2); 
		assertEquals(2, s1.getNumberOfBookRecords());
		assertEquals(10, s1.getNumberOfBookCopies());
		assertEquals("2 records and 10 copies: {Hamlet (7), King Lear (3)}", s1.getStatus());
		
		/* The book shelf is full (i.e., the maximum 10 book copies reached). */
		
		BookRecord r3 = new BookRecord("Romeo and Juliet", 1, s1);
		
		/* Case 2 of adding a book record:
		 * 	An error will be resulted from the following mutator call 
		 * 	(due to the shelf being already full). 
		 * The corresponding error message should then be set to the shelf's status.
		 */
		s1.addBookRecord(r3);
		/* Note: `10` in the error message corresponds to the specified maximum number when s1 was created. */
		assertEquals("Error: maximum number of book copies (10) reached", s1.getStatus());
		
		/* An error occurring does not modify the existing records and copies on shelf. */
		assertEquals(2, s1.getNumberOfBookRecords());
		assertEquals(10, s1.getNumberOfBookCopies());
		/* Note. You need not worry if in your implementation, 
		 * 	after the last mutator call where r3 could not be added to the full s1, 
		 * 	the located shelf of r3 is still linked to s1.
		 * 
		 * That is, there is no need to assign the located shelf of r3 to null upon an error like above.
		 */
	} 
	
	@Test
	public void test_04() {
		/* Create an empty shelf which can store 
		 * up to the specified maximum number of book copies. 
		 */
		Shelf s1 = new Shelf(10);
		 
		BookRecord r1 = new BookRecord("Hamlet", 5, s1); 
		BookRecord r2 = new BookRecord("King Lear", 2, s1); 
		s1.addBookRecord(r1);
		s1.addBookRecord(r2);
		assertEquals(2, s1.getNumberOfBookRecords());
		assertEquals(7, s1.getNumberOfBookCopies());
		assertEquals("2 records and 7 copies: {Hamlet (5), King Lear (2)}", s1.getStatus());
		
		/* The book shelf is now 3 copies away from being full. */	
		
		BookRecord r3 = new BookRecord("Romeo and Juliet", 4, s1);
		
		/* Case 3 of adding a book record:
		 * 	An error will be resulted from the following mutator call
		 * 	(due to the shelf's remaining space cannot accommodate r3's book copies). 
		 * 
		 * The corresponding error message should then be set to the shelf's status.
		 * The error message should also display how much space (in terms of book copies)
		 * the shelf is short of.  
		 * e.g., current shelf has space for 3 copies, which is 1 copy short of the intended 4 copies of r3.
		 * 
		 * Of course, "short of 0" is not an error, as it means the shelf would just become full.
		 * 
		 * Note. Always spell `copies` in the plural form.
		 * There is no need to say, e.g., 1 copy.
		 */
		s1.addBookRecord(r3); 
		assertEquals("Error: insufficient space left on the shelf (1 copies short)", s1.getStatus());
		
		/* An error occurring does not modify the existing records and copies on shelf. */
		assertEquals(2, s1.getNumberOfBookRecords());
		assertEquals(7, s1.getNumberOfBookCopies());
		
		/* Note. When the shelf is already full, an attempt to add more book copies always results in
		 * the error message as shown in test_03, not an error message showing insufficient space.  
		 */
	}
	
	@Test
	public void test_05() { 
		Shelf s1 = new Shelf(10);
		 
		BookRecord r1 = new BookRecord("Hamlet", 5, s1); 
		BookRecord r2 = new BookRecord("King Lear", 2, s1); 
		s1.addBookRecord(r1);
		s1.addBookRecord(r2);
		assertEquals("2 records and 7 copies: {Hamlet (5), King Lear (2)}", s1.getStatus());
		
		/* The book shelf is now 3 copies away from being full. */	
		
		BookRecord r3 = new BookRecord("King Lear", 2, s1);
		
		/* Case 4 of adding a book record:
		 * 	When adding a book record with some existing title,
		 * 	update the book copies of the existing stored book record only.
		 * e.g., The following mutator call will increase the number of book copies for "King Lear" by 2.    
		 */
		s1.addBookRecord(r3);
		
		assertEquals(2, s1.getNumberOfBookRecords());
		assertEquals(9, s1.getNumberOfBookCopies());
		assertEquals("2 records and 9 copies: {Hamlet (5), King Lear (4)}", s1.getStatus());
	}
	
	@Test
	public void test_06() {
		Shelf s1 = new Shelf(10);
		Shelf s2 = new Shelf(10);
		Shelf s3 = new Shelf(10);
		
		/* Recall the assumption from test_02: a book record is always added to its located shelf. 
		 * e.g., in the line below, the anonymous book record object's located shelf is set to s1,
		 * 			and that anonymous object is added to s1's collection.  
		 */
		s1.addBookRecord(new BookRecord("Romeo and Juliet", 4, s1));
		
		/* Copies of a book may be distributed over multiple shelves. */
		s1.addBookRecord(new BookRecord("Hamlet", 3, s1));
		s2.addBookRecord(new BookRecord("Hamlet", 6, s2));
		
		s2.addBookRecord(new BookRecord("The Tempest", 2, s2));
		s3.addBookRecord(new BookRecord("King Lear", 5, s3));
		
		/* Create an empty library which can store up to 50 shelves. */
		Library lib = new Library();
		
		/* Add an array of shelves to a library.
		 * 
		 * Assume: 
		 * 	- Each element of the input array is a valid shelf object.
		 * 	- Length of the input array will not result in the library's capacity (50) being exceeded.
		 * 	- Shelve IDs in the input array do not clash with each other, 
		 * 		and neither do they clash with IDs of shelves already stored in the library.  
		 */
		Shelf[] input1 = {s1, s2};
		lib.addShelves(input1);
		Shelf[] shelves1 = lib.getShelves();
		assertTrue(
				shelves1.length == 2
			&&	shelves1[0] == s1
			&& 	shelves1[1] == s2
		);
		
		Shelf[] input2 = {s3};
		lib.addShelves(input2);
		Shelf[] shelves2 = lib.getShelves();
		assertTrue(
				shelves2.length == 3
			&&	shelves2[0] == s1
			&& 	shelves2[1] == s2
			&& 	shelves2[2] == s3
		);	
		
		Shelf[] input3 = {};
		lib.addShelves(input3); /* Adding an empty array of shelves should cause no change. */
		Shelf[] shelves3 = lib.getShelves();
		assertTrue(
				shelves3.length == 3
			&&	shelves3[0] == s1
			&& 	shelves3[1] == s2
			&& 	shelves3[2] == s3
		);
	}
	
	@Test
	public void test_07() {
		Shelf s1 = new Shelf(10);
		Shelf s2 = new Shelf(10);
		Shelf s3 = new Shelf(10);
		
		s1.addBookRecord(new BookRecord("Romeo and Juliet", 4, s1));
		
		/* Copies of a book may be distributed over multiple shelves. */
		s1.addBookRecord(new BookRecord("Hamlet", 3, s1));
		s2.addBookRecord(new BookRecord("Hamlet", 6, s2));
		
		s2.addBookRecord(new BookRecord("The Tempest", 2, s2));
		s3.addBookRecord(new BookRecord("King Lear", 5, s3));
		
		/* Create an empty library which can store up to 50 shelves. */
		Library lib = new Library();
		 
		Shelf[] input = {s1, s2, s3};
		lib.addShelves(input);
		Shelf[] shelves = lib.getShelves();
		assertEquals(3, shelves.length);
		assertEquals("2 records and 7 copies: {Romeo and Juliet (4), Hamlet (3)}", shelves[0].getStatus());
		assertEquals("2 records and 8 copies: {Hamlet (6), The Tempest (2)}", shelves[1].getStatus());
		assertEquals("1 records and 5 copies: {King Lear (5)}", shelves[2].getStatus());
		
		/* Across all shelves, 
		 * return the total number of book records with the input book title.
		 * e.g., two book records with title "Hamlet" can be located: from s1 and s2. 
		 */
		assertEquals(2, lib.getNumberOfBookRecords("Hamlet"));
		
		/* Across all shelves, 
		 * return the total number of available book copies with the input book title.
		 * e.g., book records with title "Hamlet" can be located in s1 (3 copies) and s2 (6 copies). 
		 */
		assertEquals(3 + 6, lib.getNumberOfBookCopies("Hamlet"));
		
		/* If none of the shelves stores a book record with the specified title,
		 * then return 0. 
		 */
		assertEquals(0, lib.getNumberOfBookRecords("Life of Pi"));
		assertEquals(0, lib.getNumberOfBookCopies("Life of Pi"));
	}
	
	@Test
	public void test_08() {
		Shelf s1 = new Shelf(10);
		Shelf s2 = new Shelf(10);
		Shelf s3 = new Shelf(10);
		
		s1.addBookRecord(new BookRecord("Romeo and Juliet", 4, s1));
		
		/* Copies of a book may be distributed over multiple shelves. */
		s1.addBookRecord(new BookRecord("Hamlet", 3, s1));
		s2.addBookRecord(new BookRecord("Hamlet", 6, s2));
		
		s2.addBookRecord(new BookRecord("The Tempest", 2, s2));
		s3.addBookRecord(new BookRecord("King Lear", 5, s3));
		
		/* Create an empty library which can store up to 50 shelves. */
		Library lib = new Library();
		 
		Shelf[] input = {s1, s2, s3};
		lib.addShelves(input);
		Shelf[] shelves1 = lib.getShelves();
		assertEquals(3, shelves1.length);
		assertEquals("2 records and 7 copies: {Romeo and Juliet (4), Hamlet (3)}", shelves1[0].getStatus());
		assertEquals("2 records and 8 copies: {Hamlet (6), The Tempest (2)}", shelves1[1].getStatus());
		assertEquals("1 records and 5 copies: {King Lear (5)}", shelves1[2].getStatus());
		
		/* Across all shelves, 
		 * return those shelves holding book records with the input book title.
		 * e.g., book records with title "Hamlet" can be located in s1 and s2.
		 * 
		 * Shelf objects in the returned array should be arranged according to
		 * the order in which they were added to the library.
		 */
		Shelf[] shelves2 = lib.getShelves("Hamlet");
		assertEquals(2, shelves2.length);
		assertTrue(s1 == shelves2[0]);
		assertTrue(s2 == shelves2[1]);
	}
}