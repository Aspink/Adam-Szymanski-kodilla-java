package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Library extends Prototype{
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String string = "\nLibrary name: " + name + ",\n books:";
        for (Book book:books) {
            string = string + "\n  " + book.toString();
        }
        return string;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            String title = book.title;
            String author = book.author;
            LocalDate publicationDate = book.publicationDate;
            Book clonedBook = new Book(title, author, publicationDate);

            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }
}
