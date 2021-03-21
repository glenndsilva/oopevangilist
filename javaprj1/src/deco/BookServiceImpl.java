package deco;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
      public List<Book>  findAll(){
    	  System.out.println("load new data");
    	  List<Book> books = new ArrayList<Book> ();
    	  books.add(new Book("BookA"));
    	  return books;
      }
}
