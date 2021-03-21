package deco;

import java.util.List;

public class BookServiceCacheDecorator extends BookServiceDecorator {

    private Cache cache;

    public BookServiceCacheDecorator(BookService decorated) {
        super(decorated);
    }

    public BookServiceCacheDecorator(BookService decorated, Cache cache) {
        super(decorated);
        this.cache = cache;
    }

    @Override
    public List<Book> findAll() {
        if(cache.hasResult()){
            return cache.load();
        }
        List<Book> books = decorated.findAll();
        cache.save(books);
        return books;
    }
}
