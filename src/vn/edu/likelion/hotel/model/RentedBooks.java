package vn.edu.likelion.hotel.model;

import java.time.LocalDate;

public class RentedBooks {
    private int id_borrower;
    private int id_rentedBook;
    private String name_rentedBook;
    private LocalDate borrowBook_date;
    private LocalDate returnBook_date;
    private int quantityRentedBook;



    public RentedBooks(int id_borrower, int id_rentedBook, String name_rentedBook, LocalDate borrowBook_date, LocalDate returnBook_date, int quantityRentedBook) {
        this.id_borrower = id_borrower;
        this.id_rentedBook = id_rentedBook;
        this.name_rentedBook = name_rentedBook;
        this.borrowBook_date = borrowBook_date;
        this.returnBook_date = returnBook_date;
        this.quantityRentedBook = quantityRentedBook;
    }

    public RentedBooks() {}

    public RentedBooks(int id_borrower, int id_rentedBook, String name_rentedBook, LocalDate now, LocalDate localDate) {
        this.id_borrower = id_borrower;
        this.id_rentedBook = id_rentedBook;
        this.name_rentedBook = name_rentedBook;
        borrowBook_date = now;
        returnBook_date = localDate;
    }

    public int getId_borrower() {
        return id_borrower;
    }

    public void setId_borrower(int id_borrower) {
        this.id_borrower = id_borrower;
    }
    public int getId_rentedBook() {
        return id_rentedBook;
    }

    public void setId_rentedBook(int id_rentedBook) {
        this.id_rentedBook = id_rentedBook;
    }

    public String getName_rentedBook() {
        return name_rentedBook;
    }

    public void setName_rentedBook(String name_rentedBook) {
        this.name_rentedBook = name_rentedBook;
    }


    public LocalDate getBorrowBook_date() {
        return borrowBook_date;
    }

    public void setBorrowBook_date(LocalDate borrowBook_date) {
        this.borrowBook_date = borrowBook_date;
    }

    public LocalDate getReturnBook_date() {
        return returnBook_date;
    }

    public void setReturnBook_date(LocalDate returnBook_date) {
        this.returnBook_date = returnBook_date;
    }

    public int getQuantityRentedBook() {
        return quantityRentedBook;
    }

    public void setQuantityRentedBook(int quantityRentedBook) {
        this.quantityRentedBook = quantityRentedBook;
    }

    @Override
    public String toString() {
        return String.format("%d|%d|%s|%s|%s|%s",
                id_borrower, id_rentedBook, name_rentedBook, borrowBook_date, returnBook_date, quantityRentedBook);
    }
}
