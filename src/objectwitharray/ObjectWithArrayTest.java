package objectwitharray;

import java.util.Arrays;

public class ObjectWithArrayTest {
	/*
	 * syntax :
	 * 
	 * class_name[] array_name = new class_name[size];
	 * 
	 * 
	 * 
	 * e.g. //array of Student
	 * 
	 * Student array[] = new Student[20];
	 * 
	 * Student s1 = new Student(); s1.setId(7666); ...... .....
	 * 
	 * array[0] = s1;
	 * 
	 * //array of Book Book books[] = new Book[500];
	 * 
	 * //array of Employee Employee[] emps = new Employee[30];
	 * 
	 */

	public static void main(String[] args) {

		//create array
		Book[] books = getBookArray();
		
		//print book array
		printBooks(books);

		//print selected books
		bookProcessing(books);

	}

	private static void bookProcessing(Book[] books) {
		// print selected books
		for (Book b1 : books) {

			// print Nepali books only
			if (b1.getName().equals("Nepali")) {
				System.out.println(b1);
			}
		}
	}

	private static Book[] getBookArray() {
		// create array of book(5)
		Book books[] = new Book[5];

		for (int i = 0; i < books.length; i++) {

			Book b = new Book();

			b.setName("English");

			b.setAuthor("S.P Gupta");

			b.setPages(4500);

			b.setPrice(2000);

			books[i] = b;
		}
		return books;
	}

	// pass array of object as arguments
	static void printBooks(Book books[]) {

		// print array of book
		System.out.println(Arrays.toString(books));

	}

}
