package com.BikkadIT.BookStore.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.BookStore.model.Book;

@Controller
public class BookController {
		
	public BookController() {
		super();
		System.out.println("Book class controller");
		
	}

	@GetMapping("/BookInfo")
	public ModelAndView getBookdata() {
		
		Book book = new Book();
		book.setBookId(111);
		book.setBookName("Java");
		book.setBookPrice(700.50);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOK",book);
		mav.setViewName("books");
				
		return mav;
					
	}
	
	@GetMapping("/BookAllInfo")
	public ModelAndView getAllBookdata() {
		
		Book book1 = new Book();
		book1.setBookId(111);
		book1.setBookName("Java");
		book1.setBookPrice(700.50);
		
		Book book2 = new Book();
		book2.setBookId(121);
		book2.setBookName("Python");
		book2.setBookPrice(652.50);
		
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOK",books);
		mav.setViewName("books");
				
		return mav;

	}
}
