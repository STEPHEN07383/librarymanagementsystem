package librarymanagementsystem;

import java.util.*;
public class Library {

	private List <User> users;
	private List <Patron> patrons;
	private static  int totalBooksBought;
	private static int totalBooksBorrowed;
	
	public Library(List <Patron> patrons, List<User> users) {
		this.users = users;
		this.patrons = patrons;
		totalBooksBought = 0;
		totalBooksBorrowed = 0;
	}

	public List<User> getUsers() {
		return users;
	}

	public  void addUser(User user) {
		users.add(user);
	}

	public List<Patron> getPatrons() {
		return patrons;
	}

	public void addPatron(Patron patron) {
		patrons.add(patron);
	}

	public int getTotalBooksBought() {
		return totalBooksBought;
	}

	public static void updateTotalBooksBought(int BooksBought) {
		totalBooksBought += BooksBought;
	}

	public  int getTotalBooksBorrowed() {
		return totalBooksBorrowed;
	}

	public static void updateTotalBooksBorrowed(int BooksBorrowed) {
		totalBooksBought -= BooksBorrowed;
	}
	
	
}
