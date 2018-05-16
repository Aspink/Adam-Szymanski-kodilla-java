package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Library library1 = new Library("Main Library");

        Book book1 = new Book("Gone with the Wind", "Margaret Mitchell",  LocalDate.of(1936, 06, 30));
        Book book2 = new Book("The Thin Red Line", "James Jones", LocalDate.of(1962, 8, 15));
        Book book3 = new Book("The Deluge", "Henryk Sienkiewicz", LocalDate.of(1886, 10,2 ));
        Book book4 = new Book("The Hobbit", "John Ronald Reuel Tolkien", LocalDate.of(1937, 9,21));

        library1.books.add(book1);
        library1.books.add(book2);
        library1.books.add(book3);
        library1.books.add(book4);

        //When
        Set booksSet = library1.getBooks();

        //Then
        booksSet.stream()
                .forEach(s -> System.out.println(s));

        Assert.assertTrue(booksSet.contains(book2));

    }
}
