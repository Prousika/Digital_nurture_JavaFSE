package com.library.repository;

import com.library.entity.Book;
import com.library.projection.BookProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByPriceGreaterThan(double price);
    List<Book> findByPriceLessThan(double price);
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorAndTitle(String author, String title);
    List<Book> findByPriceBetween(double start,double end);

    @Query("SELECT b FROM Book b")
    List<Book> getAllBooksJPQL();

    @Query(
            value="SELECT * FROM Book WHERE price > (SELECT AVG(price) FROM Book)",
            nativeQuery=true)
    List<Book> getBooksPriceGreaterThanAvg();

    List<BookProjection> findByPrice(double price);
}
