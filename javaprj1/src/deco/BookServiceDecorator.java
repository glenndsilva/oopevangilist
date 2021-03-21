package deco;

abstract public class BookServiceDecorator implements BookService{

    protected BookService decorated;

    public BookServiceDecorator(BookService decorated){
        this.decorated = decorated;
    }
}
