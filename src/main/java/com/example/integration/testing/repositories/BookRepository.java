package com.example.integration.testing.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.integration.testing.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

	List<Book> findByTitle(String title);
	
}
