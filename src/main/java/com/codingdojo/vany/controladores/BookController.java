package com.codingdojo.vany.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.vany.modelos.Book;
import com.codingdojo.vany.servicios.BookService;

@Controller
public class BookController {
	
	private final BookService servicio;
	
	public BookController(BookService servicio) {
		this.servicio = servicio;
	}

	@RequestMapping(value="/show/{id}",method=RequestMethod.GET)
	public String show(@PathVariable("id")Long id,
						Model model) {
		Book show_books = servicio.findBook(id);
		model.addAttribute("show_books",show_books);
		return "show.jsp";
		
	}
	
	
}
