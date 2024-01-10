package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public Library(Book... books){
        this.books = new ArrayList<>(Arrays.asList(books));
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new  LibIterator();
    }

    private final class LibIterator implements Iterator<Book>{
        private int start = 0;

        @Override
        public boolean hasNext() {
            return start < books.size();
        }

        @Override
        public Book next() {
            Book nextBook = books.get(start);
            start++;
            return nextBook;
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}

