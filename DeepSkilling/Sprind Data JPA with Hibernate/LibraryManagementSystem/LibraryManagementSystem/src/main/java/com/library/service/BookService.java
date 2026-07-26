package com.library.service;

import com.library.entity.Book;
import com.library.projection.BookProjection;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.core.support.RepositoryMethodInvocationListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Page<Book> getBooks(int page,int size){
        Pageable pageable = PageRequest.of(page,size);
        return bookRepository.findAll(pageable);
    }

    public List<Book> sortByPrice(){
        return bookRepository.findAll(Sort.by("price").descending());
    }

    public Book saveBook(Book book){

        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){

        return bookRepository.findAll();
    }

    public Book getBookById(Integer id){

        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Book book){

        return bookRepository.save(book);
    }

    public void deleteBook(Integer id){

        bookRepository.deleteById(id);
    }

    public List<Book> getBooksByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public List<Book> getBookByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }

    public List<Book> getBooksByPriceGreaterThan(double price){
        return bookRepository.findByPriceGreaterThan(price);
    }

    public List<Book> getBooksByPriceLessThan(double price) {
        return bookRepository.findByPriceLessThan(price);
    }

    public List<Book> getBooksByTitleContaining(String title){
        return bookRepository.findByTitleContaining(title);
    }

    public List<Book> getBooksByAuthorAndTitle(String author, String title) {
        return bookRepository.findByAuthorAndTitle(author,title);
    }

    public List<Book> getBooksByPriceBetween(double start, double end){
        return bookRepository.findByPriceBetween(start,end);
    }

    public List<Book> getAllBooksJPQL(){
        return bookRepository.getAllBooksJPQL();
    }

    public List<Book> getBooksGreaterThanAvg(){
        return bookRepository.getBooksPriceGreaterThanAvg();
    }

    public List<BookProjection> getBooksProjection(double price){
        return bookRepository.findByPrice(price);
    }
}
