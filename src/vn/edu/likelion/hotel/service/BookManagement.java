package vn.edu.likelion.hotel.service;

import vn.edu.likelion.hotel.interfaceImp.Management;
import vn.edu.likelion.hotel.model.Book;
import vn.edu.likelion.hotel.model.Borrower;
import vn.edu.likelion.hotel.model.RentedBooks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement implements Management {

    ArrayList<Book> bookArrayList = new ArrayList<>();
    ArrayList<RentedBooks> rentedBooksList = new ArrayList<>();

    public BookManagement() {
        // Initialize books
        bookArrayList.add(new Book(1,1, "sach1", "tacgia1", 10));
        bookArrayList.add(new Book(2,2, "sach2", "tacgia2", 20));
        bookArrayList.add(new Book(3,3, "sach3", "tacgia3", 30));
        bookArrayList.add(new Book(4,4, "sach4", "tacgia4", 40));
    }


    @Override
    public void showAll() {
        for (Book book : bookArrayList) {
            System.out.println(book);
        }
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID: ");
        int book_id = sc.nextInt();
        System.out.println("Enter Book STT: ");
        int book_stt = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Title: ");
        String book_title = sc.next();
        System.out.println("Enter Book Author: ");
        String book_author = sc.next();
        System.out.println("Enter Book Quantity: ");
        int book_quantity = sc.nextInt();
        Book book = new Book(book_id,book_stt, book_title, book_author, book_quantity);
        bookArrayList.add(book);
    }

    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID to update: ");
        int id = sc.nextInt();

        for (Book book : bookArrayList) {
            if (book.getBook_id() == id) {
                sc.nextLine();
                System.out.println("Enter Book Title: ");
                book.setBook_name(sc.nextLine());
                System.out.println("Enter Book Author: ");
                book.setBook_author(sc.nextLine());
                System.out.println("Enter Book Quantity: ");
                book.setBook_quantity(sc.nextInt());

                System.out.println("Updated Book: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }


    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID to delete: ");
        int id = sc.nextInt();

        for (Book book : bookArrayList) {
            if (book.getBook_id() == id) {
                bookArrayList.remove(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showAllRentedBooks() {
        for (RentedBooks rentedBooks : rentedBooksList) {
            System.out.println(rentedBooks);
        }
    }

    public void rentedBooks() {
        Scanner sc = new Scanner(System.in);
        //Tim id nguoi muon sach
        System.out.println("Enter Borrower ID to rented: ");
        int borrower_id = sc.nextInt();

        System.out.println("Enter Book ID to rented: ");
        int book_id = sc.nextInt();

        System.out.println("Enter Quantity Book to rented: ");
        int quantity_book = sc.nextInt();

        
        for (Borrower borrower: BorrowerManagement.borrowersArrayList) {
            if (borrower.getId_borrower()==borrower_id ){
                rentedBooks.setId_borrower(borrower.getId_borrower());

                rentedBooks.setName_borrower(borrower.getName_borrower());
                LocalDate borrow_date = borrower.getBorrow_date();
                String return_date = borrower.getReturn_date();
                //tim id sach se cho muon
                for (Book book : bookArrayList) {
                    if (book_id == book.getBook_id()) {
                        rentedBooks.setId_rentedBook(book.getBook_id());
                        rentedBooks.setName_rentedBook(book.getBook_name());
                        rentedBooks.setQuantityRentedBook(book.getBook_quantity()-quantity_book);
                    }
                }

            }

        }
        showAllRentedBooks();
    }


}
