package com.onlinebookshop.shop;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.onlinebookshop.shop.model.Author;
import com.onlinebookshop.shop.model.Book;
import com.onlinebookshop.shop.model.Order;
import com.onlinebookshop.shop.service.AuthorService;
import com.onlinebookshop.shop.service.BookService;
import com.onlinebookshop.shop.service.OrderService;
 
@SpringBootApplication
@EnableAspectJAutoProxy
public class ShopApplication implements CommandLineRunner {
 
	@Autowired
	private BookService bookService ;
	
	@Autowired
    private AuthorService authorService;
	
	@Autowired
    private OrderService orderService;
	
	
	//inject the author beans
	
	//inject the order beans
	
	
	@Autowired
    private Book book1;
    @Autowired
    private Book book2;
    @Autowired
    private Author author1;
    @Autowired
    private Author author2;
    @Autowired
    private Order order1;
    @Autowired
    private Order order2;
	
	
    
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Test the services
		//inject the service layer 
		//add books
		
//		Book book1 = new Book(3, "New Book JDBC", 300.00, 1);
//		Book book2 = new Book(4, "New Book JDBC 2", 350.00, 2);
//		bookService.addBook(book1);
//		bookService.addBook(book2);
		System.out.println("Books added successfully");
		//fetch all books 
		List<Book> books = bookService.getAllBooks();
		System.out.println("-----------Books List----------");
		books.forEach(book -> 
		System.out.println("Book ID : " + book.getId()+ " , Title : "+ book.getTitle()+ " , Price : "+ book.getPrice()));
		//get book by id
		int bookId =1;
		Book foundBook = bookService.getBookById(bookId);
		System.out.println("The ");
		//update
		foundBook.setPrice(450.00);
		bookService.updateBook(foundBook);
		System.out.println("Updated Price : "+ foundBook.getPrice());
		//delete
		int bookId2 = 3;
		bookService.deleteById(bookId2);
		System.out.println(" The book with Id " + bookId + " is deleted");
		//fetch updated book list
		bookService.getAllBooks().forEach(book -> 
		System.out.println("Book ID : " + book.getId()+ " , Title : "+ book.getTitle()+ " , Price : "+ book.getPrice()));
	
		
		

//        Test AuthorService
//        Author author1 = new Author(3, "Valmiki", "India");
//        Author author2 = new Author(4, "Alfred", "USA");
//        
        authorService.addAuthor(author1);
        authorService.addAuthor(author2);
        System.out.println("Authors added successfully");
//
//        // fetch all authors
        List<Author> authors = authorService.getAllAuthors();
        System.out.println("-----------Authors List----------");
        authors.forEach(author -> 
        System.out.println("Author ID : " + author.getId() + " , Name : " + author.getName() + " , Country : " + author.getCountry()));

//        // get author by id
        int authorId = 1;
        Author foundAuthor = authorService.getAuthorById(authorId);
        System.out.println("Found Author: " + foundAuthor.getName());

//        // update author
        foundAuthor.setCountry("Ireland");
        authorService.updateAuthor(foundAuthor);
        System.out.println("Updated Country : " + foundAuthor.getCountry());

//        // delete author
        int authorId2 = 2;
        authorService.deleteById(authorId2);
        System.out.println("The author with Id " + authorId2 + " is deleted");

//        // fetch updated author list
        authorService.getAllAuthors().forEach(author -> 
        System.out.println("Author ID : " + author.getId() + " , Name : " + author.getName() + " , Country : " +  author.getCountry()));
		
		
//		// Test OrderService
//        Order order1 = new Order(2, 1, 2);  
//        Order order2 = new Order(3, 1, 3);  
//        orderService.addOrder(order1);
//        orderService.addOrder(order2);
//        System.out.println("Order added successfully");

		

        // Fetch all orders
        List<Order> orders = orderService.getAllOrders();
        System.out.println("-----------Orders List----------");
        orders.forEach(order -> 
        System.out.println("Order ID : " + order.getId() + " , Book ID : " + order.getBookId() + " , Quantity : " + order.getQuantity()));

        // Get order by id
        int orderId = 1;
        Order foundOrder = orderService.getOrderById(orderId);
        System.out.println("Found Order: " + foundOrder.getId());

        // Update order
        foundOrder.setQuantity(5);
        orderService.updateOrder(foundOrder);
        System.out.println("Updated Quantity : " + foundOrder.getQuantity());

        // Delete order
        int orderId2 = 2;
        orderService.deleteById(orderId2);
        System.out.println("The order with Id " + orderId2 + " is deleted");

        // Fetch updated order list
        orderService.getAllOrders().forEach(order -> 
        System.out.println("Order ID : " + order.getId() + " , Book ID : " + order.getBookId() + " , Quantity : " + order.getQuantity()));
        
 
    }
		
	
 
}