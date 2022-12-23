package oops;

public class Book {
	
	//properties
	  String name;
	  int price;
	  String author;
	  int pages;
	
	//methods
	  void printBook() {
		  
		  System.out.println("Name = "+name);
		  System.out.println("Price = "+price);
		  System.out.println("Author = "+author);
		  System.out.println("Pages = "+pages);
	  }
	  
	  public static void main(String[] args) {
		
		  Book b = new Book();
		  
		  b.name = "English";
		  b.price = 3500;
		  b.author = "SK.Gupta";
		  b.pages = 1200;
		  
		  b.printBook();
		  
		  
		  
	}
	  /*
	   *  1> Car
	   *  2> Dog
	   *  3> Student
	   *  4> Laptop
	   *  5> College
	   */
	  
}
