CREATE TABLE authors (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	country VARCHAR(255) NOT NULL
);
CREATE TABLE books(
	id INT AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(255) NOT NULL,
	author_id INT NOT NULL,
	price DECIMAL(10,2),
	FOREIGN KEY (author_id) REFERENCES authors(id) ON DELETE CASCADE
);
CREATE TABLE orders(
	id INT AUTO_INCREMENT PRIMARY KEY,
	book_id INT NOT NULL,
	quantity INT NOT NULL,
	order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE
);