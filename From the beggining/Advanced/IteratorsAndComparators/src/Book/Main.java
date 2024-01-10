package Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
//       List<Book> books = new ArrayList<>();
//        books.add(bookOne);
//        books.add(bookTwo);
//        books.add(bookThree);

        //Exercise 2 - Create a class Library from UML diagram. Create a nested class LibIterator from UML diagram
        Library library = new Library(bookOne, bookThree, bookTwo);
//        library.addBooks(bookOne);
//        library.addBooks(bookThree);
//        library.addBooks(bookTwo);

        //Exercise 3 - Expand Book by implementing Comparable<Book>. Book have to be compared by title. When title is equal, compare them by year. Expand Book from UML diagram below:

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        Collections.sort(books);


        for (Book book : books) {
            System.out.println(book);
        }
    }
}
