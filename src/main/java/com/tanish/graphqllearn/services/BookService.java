package com.tanish.graphqllearn.services;

import com.tanish.graphqllearn.entities.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);
}
