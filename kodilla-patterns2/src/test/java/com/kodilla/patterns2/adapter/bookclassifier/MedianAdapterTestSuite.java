package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Henryk Sienkiewicz", "Potop", 1991, "8304036320"));
        books.add(new Book("Fiodor Dostojewski", "Biesy", 2010, "8324013997"));
        books.add(new Book("Bruce Eckel", "Thinking in Java",2006, "9788328334427"));
        books.add(new Book("Grzegorz Kubicki", "Ania. Biografia Anny Przybylskiej", 2017, "9788326825828"));
        books.add(new Book("David Lagercrantz", "MILLENIUM Co nas nie zabije", 2015, "9788380150492"));
        books.add(new Book("Cay S. Horstmann", "JAVA Podstawy", 2016, "9788328324800"));
        books.add(new Book("Norman Davies", "Na krańce świata", 2017, "9788324041695"));
        books.add(new Book("Norman Davies", "Europa walczy 1939-1945. Nie takie proste zwycięstwo.", 2008, "9788324010103"));
        books.add(new Book("Norman Davies", "Europa Między Wschodem a Zachodem", 2007, "9788324008513"));
        books.add(new Book("Maurice Druon", "Wilczyca z Francji", 2001, "8372007748"));
        books.add(new Book("Anna Herbich", "Dziewczyny z Wołynia", 2018, "9788324042913"));

        for(Book book : books) {
            System.out.println(book);
        }
        //When
        int mediana = medianAdapter.publicationYearMediana(books);
        System.out.println("\nMediana roku wydania: " + mediana);
        //Then
        assertEquals(2010, mediana);
    }
}
