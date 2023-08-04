package librarymanagementsystem;

public class User {
	
	private int id;
	private String name;
	private int books;
	private int booksBorrowed;
	
	public User(int id, String name, int books) {
		this.id = id;
		this.books = books;
		this.name = name;
		this.booksBorrowed = 0;
	}
	
	public int getBooks() {
		return books;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBooksBorrowed() {
		return booksBorrowed;
	}
	
	public void setBooks(int books) {
		this.books = books;
	}
	public void borrowBook(int book) {
		 booksBorrowed += books;
			Library.updateTotalBooksBorrowed(book);
	 }
	public String toString() {
		return "Id: " + id +
				"\nName: " + name +
				"\nBooks Borrowed: " + booksBorrowed;
				
	}
	
	
}
