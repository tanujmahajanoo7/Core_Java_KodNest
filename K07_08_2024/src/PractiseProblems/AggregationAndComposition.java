package PractiseProblems;

class Author
{
	String name;
	String email;
}

class Book
{
	String title;
	int price;
	
	Author a = new Author(); // This is a compostion
	
}

public class AggregationAndComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author = new Author();
		Book book = new Book();
		
		author.name="Rohit";
		author.email="Rohit@gmail.com";
		System.out.println(author.name+" "+author.email);
		book.title="Crypto";
		book.price=100;
		System.out.println(book.title+" "+book.price);
		
		book.a.name = "Faran";
		book.a.email="Faran@gmail.com";
		System.out.println(book.a.name);
		System.out.println(book.a.email);
	}
}
