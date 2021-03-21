package deco;

import java.util.List;

public class Cache {
	private List<Book> storage;

    public void save(List<Book> books){
        this.storage = books;
    }

    public boolean hasResult(){
        if(storage != null){
            return true;
        }

        return false;
    }

    public List<Book> load(){
        System.out.println("load from cache");
        return storage;
    }
    
    public static void main(String args[]) {
    	BookService bookService = new BookServiceImpl();
    	bookService.findAll(); // prints: load new data
    	bookService.findAll(); // prints: load new data
    	bookService.findAll(); // prints: load new data

    	BookService cachedBookService = new BookServiceCacheDecorator(new BookServiceImpl(), new Cache());
    	cachedBookService.findAll(); // prints: load new data
    	cachedBookService.findAll(); // prints: load from cache
    	cachedBookService.findAll(); // prints: load from cache

    }
}
