package com.library.controller;

import com.library.entity.Book;
import com.library.projection.BookProjection;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("books")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("books/{id}")
    public Book getBookById(@PathVariable("id") Integer id){
        return bookService.getBookById(id);
    }

    @PutMapping("books/{id}")
    public Book updateBook(@PathVariable Integer id,
                           @RequestBody Book book){
        book.setId(id);
        return bookService.updateBook(book);
    }

    @DeleteMapping("books/{id}")
    public String deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
        return "Book deleted Successfully";
    }

    @GetMapping("books/title/{title}")
    public List<Book> getBookByTitle(@PathVariable("title") String title){
        return bookService.getBooksByTitle(title);
    }

    @GetMapping("books/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable("author") String author){
        return bookService.getBookByAuthor(author);
    }

    @GetMapping("/books/price/greater/{price}")
    public List<Book> getBooksByPriceGreaterThan(@PathVariable double price){
        return bookService.getBooksByPriceGreaterThan(price);
    }

    @GetMapping("/books/price/lesser/{price}")
    public List<Book> getBooksByPriceLessThan(@PathVariable double price){
        return bookService.getBooksByPriceLessThan(price);
    }

    @GetMapping("/books/title/contains/{title}")
    public List<Book> getBooksByTitLeContaining(@PathVariable String title){
        return bookService.getBooksByTitleContaining(title);
    }

    @GetMapping("books/{author}/{title}")
    public List<Book> getBooksByAuthorAndTitle(@PathVariable String author,
                                               @PathVariable String title){
        return bookService.getBooksByAuthorAndTitle(author,title);
    }

    @GetMapping("/books/price/{start}/{end}")
    public List<Book> getBooksByPriceBetween(@PathVariable double start,
                                             @PathVariable double end){
        return bookService.getBooksByPriceBetween(start,end);
    }

    @GetMapping("/books/jpql")
    public List<Book> getAllBooksJPQL(){
        return bookService.getAllBooksJPQL();
    }

    @GetMapping("/books/Avg")
    public List<Book> getBooksGreaterThanAvg(){
        return bookService.getBooksGreaterThanAvg();
    }

    @GetMapping("/books/projection/{price}")
    public List<BookProjection> getBooksProjection(@PathVariable double price){
        return bookService.getBooksProjection(price);
    }

    @GetMapping("/books/page")
    public Page<Book> getBooks(@RequestParam int page, @RequestParam int size){
        return bookService.getBooks(page,size);
    }

    @GetMapping("/books/sortPrice")
    public List<Book> getSortedBooks(){
        return bookService.sortByPrice();
    }
}
