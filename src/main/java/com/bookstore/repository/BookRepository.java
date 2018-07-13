package com.bookstore.repository;

import com.bookstore.domain.Book;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book,Long>{

	@Query("SELECT c FROM Book c WHERE c.id = :id")
	Book findOne(@Param("id")Long id);
}
