package vn.edu.likelion.hotel.model;

public class Book {

    //Thuoc tinh private
    //khong cho phep truy cap ngoai class
    //Bao ve tinh toan ven cua du lieu
    private int book_id;
    private int book_stt;
    private String book_name;
    private String book_author;
    private int book_quantity;

    public Book(int book_id,int book_stt, String book_name, String book_author, int book_quantity) {
        this.book_id = book_id;
        this.book_stt = book_stt;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_quantity = book_quantity;
    }

    public int getBook_id() {
        return book_id;
    }

    //phuong thuc getter co pham vi truy cap toan bo
    public int getBook_stt() {
        return book_stt;
    }

    public void setBook_stt(int book_stt) {
        this.book_stt = book_stt;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public int getBook_quantity() {
        return book_quantity;
    }

    public void setBook_quantity(int book_quantity) {
        this.book_quantity = book_quantity;
    }

    @Override
    public String toString() {
        return String.format("%d|%d|%s|%s|%d", book_id, book_stt, book_name, book_author, book_quantity);
    }
}
