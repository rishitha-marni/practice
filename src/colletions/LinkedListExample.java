package colletions;

import java.util.Iterator;
import java.util.LinkedList;

 class Book {
  int id;
  public String bookName;
  public String author;
  public int quantity;
  
public Book(int id, String bookName, String author, int quantity) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.author = author;
	this.quantity = quantity;
}

@Override
public String toString() {
	return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", quantity=" + quantity + "]";
}

}

public class LinkedListExample{
  public static void main(String[] args) {
	  LinkedList<Book> ll= new  LinkedList<Book>();
	  Book bb= new Book(1, "fun", "rishi", 1);
	  Book bb1=new Book(2, "fun falling", "ria", 2);
	  ll.add(bb);
	  ll.add(bb1);
	  System.out.println(ll);
	  
	   Iterator<Book> it=ll.iterator();
	   while(it.hasNext()) {
		 Book book=  it.next();
		   System.out.println(book);
	   }
  }
}
