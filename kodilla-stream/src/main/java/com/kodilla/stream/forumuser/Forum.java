package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
    private final List<ForumUser> forum = new ArrayList<>();

    public Forum() {
        forum.add(new ForumUser(1, "Ryszard", 'M', LocalDate.of(1956,02,23), 1));
        forum.add(new ForumUser(2, "Borowy", 'M', LocalDate.of(1999, 8, 8), 0));
        forum.add(new ForumUser(3, "SuperBabka", 'F', LocalDate.of(2001, 5, 9), 5));
        forum.add(new ForumUser(4, "Cider", 'F', LocalDate.of(1988, 12, 01), 123));
        forum.add(new ForumUser(5, "OSTOJA", 'M', LocalDate.of(1970, 11, 23), 10));
        forum.add(new ForumUser(6, "Marek1", 'M', LocalDate.of(1975, 05, 12), 15));
        forum.add(new ForumUser(7, "DutKa", 'F', LocalDate.of(1998, 9, 11), 0));
        forum.add(new ForumUser(8, "Deneris", 'F', LocalDate.of(2000, 03, 14), 7));
        forum.add(new ForumUser(9, "Endrju", 'M', LocalDate.of(1993, 06, 05), 37));
        forum.add(new ForumUser(10, "Jacek M.", 'M', LocalDate.of(1982, 11, 11), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forum);
    }
}
