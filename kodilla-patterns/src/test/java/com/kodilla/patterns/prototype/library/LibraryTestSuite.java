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

        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);
        library1.getBooks().add(book4);

        System.out.println(library1);

        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library1.shallowCopy();
            shallowCloneLibrary.setName("Library agency 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library1.deepCopy();
            deepCloneLibrary.setName("Library agency 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library1.getBooks().remove(book2);
        Set booksSet = library1.getBooks();
        Set shallowCloneBooksSet = shallowCloneLibrary.getBooks();
        Set deepCloneBooksSet = deepCloneLibrary.getBooks();

        //Then
        System.out.println(library1);
        System.out.println(shallowCloneLibrary);
        System.out.println(deepCloneLibrary);

        Assert.assertEquals(3, booksSet.size());
        Assert.assertEquals(3, shallowCloneBooksSet.size());
        Assert.assertEquals(4, deepCloneBooksSet.size());
        Assert.assertEquals(shallowCloneLibrary.getBooks(), library1.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library1.getBooks());
    }
}
