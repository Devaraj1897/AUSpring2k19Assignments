package com.au.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.au.library.model.Book;
import com.au.library.model.Cart;
import com.au.library.repository.BooksDAO;

@RestController
public class BooksController {
	
	@Autowired
	private BooksDAO dao;
	
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public List<Book> getAll() {
		List<Book> books=dao.getAllFromDB();
		return books;
		
	}
	
	@RequestMapping(value="/books/{bookId}/get",method=RequestMethod.GET)
	public Book getFirstBook(@PathVariable(value="bookId") String bookId) {
		return dao.getAllFromDB(bookId);		
	}
	
	@RequestMapping(value="/books",method=RequestMethod.POST,consumes="application/json")
	public Book create(@RequestBody Book b) {
		dao.create(b);
		return b;
	}
	
	@RequestMapping(value="/searchhere",method=RequestMethod.POST,consumes="application/json")
	public Book search(@RequestBody Book b) {
		Book book=dao.search(b);
		return book;
	}
	
	@RequestMapping(value="/addToCart",method=RequestMethod.POST,consumes="application/json")
	public Book addToCart(@RequestBody Book b) {
		return dao.addToCart(b);
	}
	
	@RequestMapping(value="/getAllInCart",method=RequestMethod.GET)
	public List<Cart> getAllInCart(){
		return dao.getAllInCart();
	}
	
	@RequestMapping(value="/removeFromCart",method=RequestMethod.POST,consumes="application/json")
	public List<Cart> removeFromCart(@RequestBody Book b) {
		System.out.println("Here bruh.....");
		return dao.removeFromCart(b);
	}

}
