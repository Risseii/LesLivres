package com.codingdojo.vany.servicios;

import java.util.List;
import java.util.Optional; // se importa optional

import org.springframework.stereotype.Service;

import com.codingdojo.vany.modelos.Book;
import com.codingdojo.vany.repositorios.BookRepository;

@Service //la clase es un servicio
public class BookService {
	// agregar el repositorio de libros como una dependencia
    private final BookRepository bookRepository;
    
    //constructor
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // devuelve todos los libros en una lista de objetos
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // crea un libro
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // recupera un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id); //si existe un book en base al id
        if(optionalBook.isPresent()) {  //El método findById devuelve un objeto opcional que puede o no contener nuestro objeto book.
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    //UPDATE un book
    public Book updateBook(long id, String title, String desc, String lang, int numOfPages) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	
    	if(optionalBook.isPresent()) {  
    		Book book = bookRepository.findById(id).get();
    		book.setTitle(title);
    		book.setDescription(desc);
    		book.setLanguage(lang);
    		book.setNumberOfPages(numOfPages);
    		bookRepository.save(book);
            return optionalBook.get();
        } else {
            return null;
        }
  
    }
    

    public void deleteBook(long id) {
    	bookRepository.deleteById(id); //se toma del nombre de la interface BookRepository
    }

}
