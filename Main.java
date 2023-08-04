package librarymanagementsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of users: ");
        int numOfUsers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<User> users = new ArrayList<>();
        for (int i = 0; i < numOfUsers; i++) {
            System.out.println("Enter details for User " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Books Borrowed: ");
            int booksBorrowed = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            User user = new User(id, name, booksBorrowed);
            users.add(user);
        }

        System.out.print("Enter the number of patrons: ");
        int numOfPatrons = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Patron> patrons = new ArrayList<>();
        for (int i = 0; i < numOfPatrons; i++) {
            System.out.println("Enter details for Patron " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Contact: ");
            int contact = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Books Bought: ");
            int booksBought = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Patron patron = new Patron(name, contact, booksBought);
            patrons.add(patron);
        }

        Library dis = new Library(patrons, users);


        for (Patron patron : patrons) {
            System.out.print("Enter the number of books bought by " + patron.getName() + ": ");
            int booksBought = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            Patron.buyBooks(booksBought);
        }
        
        
        System.out.println("DIS has gotten: " + dis.getTotalBooksBought());

        System.out.println("------Making LIBRARY GIVE BOOKS-----");

        for (User user : users) {
            System.out.print("Enter the number of books borrowed by " + user.getName() + ": ");
            int booksBorrowed = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            user.borrowBook(booksBorrowed);
        }

        System.out.println("DIS has given out books to users, and now has " + dis.getTotalBooksBought());

        for (Patron patron : patrons) {
            System.out.println(patron);
        }

        for (User user : users) {
            System.out.println(user);
        }

        scanner.close();
    }
}
