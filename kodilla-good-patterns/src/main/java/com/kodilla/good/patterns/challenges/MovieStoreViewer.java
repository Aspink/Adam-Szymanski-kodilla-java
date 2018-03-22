package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreViewer {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String booksTitlesWithTranslations = movieStore.getMovies().entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .collect(Collectors.joining("! "));

        System.out.println("Book titles with translations:\n" + booksTitlesWithTranslations);
    }

}
