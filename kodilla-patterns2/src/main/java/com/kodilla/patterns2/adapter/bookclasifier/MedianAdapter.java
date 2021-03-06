package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMediana(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookset) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for(com.kodilla.patterns2.adapter.bookclasifier.librarya.Book thisBook : bookset) {
            books.put(new BookSignature(thisBook.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(thisBook.getAuthor(),
                    thisBook.getTitle(), thisBook.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
