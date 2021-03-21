package anony;

import java.util.HashMap;

public class Book {
           private final String isbn;
           private final String title;
          
           Book(String isbn, String title){
        	   this.isbn = isbn;
        	   this.title = title;
           }
           
           String printTo(Media media) {
        	   return media.with("isbn", this.isbn).with("title", this.title).json();
           }
           
           public static void main(String args[]) {
        	        Media media = new ToJson(new JsonPage(new HashMap<String, String>()));
        	        Book bk = new Book("001", "I Love OOP");
        	        
        	      //  media.with("isbn1", "value1");
        	         
        	        String m = bk.printTo(media);
        	        System.out.println(m);
        	        
           }
}
