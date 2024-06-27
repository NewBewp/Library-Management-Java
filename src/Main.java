import vn.edu.likelion.hotel.service.BookManagement;
import vn.edu.likelion.hotel.service.BorrowerManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        BorrowerManagement borrowerManagement = new BorrowerManagement();

        while (true) {
            System.out.println("1.Xem danh sách toàn bộ các cuốn sách");
            System.out.println("2.Thêm sách");
            System.out.println("3.Sửa sach");
            System.out.println("4.Xoa sach");
            System.out.println("5.Xem danh sach nguoi thue");
            System.out.println("6.Them nguoi thue");
            System.out.println("7.Update nguoi thue");
            System.out.println("8.Xem toan bo sach duoc thue");
            System.out.println("9.Thue sach");
            System.out.println("0.Thoát");

            System.out.println("Chọn chức năng: ");

            Scanner sc = new Scanner(System.in);
            int chose = sc.nextInt();


            switch (chose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("1.Xem danh sách toàn bộ các cuốn sách");
                    bookManagement.showAll();
                    break;
                case 2:
                    System.out.println("2.Thêm sách");
                    bookManagement.add();
                    break;
                case 3:
                    System.out.println("3.Sửa sach");
                    bookManagement.update();
                    break;
                case 4:
                    System.out.println("4.Xoa sach");
                    bookManagement.delete();
                    break;
                case 5:
                    System.out.println("5.Xem danh sach nguoi thue");
                    borrowerManagement.showAll();
                    break;
                case 6:
                    System.out.println("6.Them nguoi thue sach");
                    borrowerManagement.add();
                    break;
                case 7:
                    System.out.println("7.Update nguoi thue sach");
                    borrowerManagement.update();
                    break;
                case 8:
                    System.out.println("8.Xem toan bo sach duoc thue");
                    bookManagement.showAllRentedBooks();
                    break;
                case 9:
                    System.out.println("9.Thue sach");
                    bookManagement.rentedBooks();
                    break;
                default:
                    sc.close();
                    break;
            }
        }
    }

}