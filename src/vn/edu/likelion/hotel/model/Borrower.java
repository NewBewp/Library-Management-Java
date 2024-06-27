package vn.edu.likelion.hotel.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Borrower  {
    private int id_borrower ;
    private int stt_borrower;
    private String name_borrower;
    private int age_borrower;
    private LocalDate borrow_date;
    private String return_date;



    static ArrayList<RentedBooks> rented_books = new ArrayList<>();

    public Borrower(int id_borrower, int stt_borrower, String name_borrower, int age_borrower, LocalDate borrow_date, String return_date) {
        this.id_borrower = id_borrower;
        this.stt_borrower = stt_borrower;
        this.name_borrower = name_borrower;
        this.age_borrower = age_borrower;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
    }

    public int getId_borrower() {
        return id_borrower;
    }

    public void setId_borrower(int id_borrower) {
        this.id_borrower = id_borrower;
    }

    public int getStt_borrower() {
        return stt_borrower;
    }

    public void setStt_borrower(int stt_borrower) {
        this.stt_borrower = stt_borrower;
    }

    public String getName_borrower() {
        return name_borrower;
    }

    public void setName_borrower(String name_borrower) {
        this.name_borrower = name_borrower;
    }

    public int getAge_borrower() {
        return age_borrower;
    }

    public void setAge_borrower(int age_borrower) {
        this.age_borrower = age_borrower;
    }

    public LocalDate getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(LocalDate borrow_date) {
        this.borrow_date = borrow_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public ArrayList<RentedBooks> getRented_books() {
        return rented_books;
    }

    public void setRented_books(ArrayList<RentedBooks> rented_books) {
        this.rented_books = rented_books;
    }

    @Override
    public String toString() {
        return String.format("%d|%d|%s|%s|%s",id_borrower, stt_borrower, name_borrower, borrow_date, return_date);
    }
}
