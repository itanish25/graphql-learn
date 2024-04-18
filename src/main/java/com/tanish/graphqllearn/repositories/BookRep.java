package com.tanish.graphqllearn.repositories;

import com.tanish.graphqllearn.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book, Integer> {
}
