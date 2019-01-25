package com.au.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.model.Book;
import com.au.library.model.Cart;

@Repository
public class BooksDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Book> getAllFromDB() {
		return jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getString("name"), rs.getString("id"), rs.getString("author"), rs.getInt("Price"),
					rs.getString("description"));
		});
	}

	public Book getAllFromDB(String id) {
		List<Book> books = jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getString("name"), rs.getString("id"), rs.getString("author"), rs.getInt("Price"),
					rs.getString("description"));
		});
		for(Book bk:books) {
			if(bk.getId().equals(id))
			{
				System.out.println("Here");
				return bk;
			}
		}
		return null;
	}

	public Book create(Book book) {
		jdbcTemplate.update("insert into book(id,name,author,price,description) values(?,?,?,?,?)", book.getId(),
				book.getName(), book.getAuthor(), book.getPrice(),book.getDescription());
		return book;
	}

	public Book search(Book b) {
		List<Book> books = jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getString("name"), rs.getString("id"), rs.getString("author"), rs.getInt("Price"),
					rs.getString("description"));
		});		
		return null;
	}

	public Book addToCart(Book book) {
		try {
		jdbcTemplate.update("insert into cart(id,name,author,price,description) values(?,?,?,?,?)", book.getId(),
				book.getName(), book.getAuthor(), book.getPrice(),book.getDescription());
		}
		catch(Exception e)
		{
			System.out.println("Not added");
			return null;
		}
		return book;
	}

	public List<Cart> getAllInCart() {
		return jdbcTemplate.query("select * from cart", (rs, i) -> {
			return new Cart(rs.getString("name"), rs.getString("id"), rs.getString("author"), rs.getInt("Price"),
					rs.getString("description"));
		});
	}

	public List<Cart> removeFromCart(Book book) {
		jdbcTemplate.update("delete from cart where id= (?) ",book.getId());
		return jdbcTemplate.query("select * from cart", (rs, i) -> {
			return new Cart(rs.getString("name"), rs.getString("id"), rs.getString("author"), rs.getInt("Price"),
					rs.getString("description"));
		});
	}

}
