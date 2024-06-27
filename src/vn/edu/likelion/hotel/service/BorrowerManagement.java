package vn.edu.likelion.hotel.service;

import vn.edu.likelion.hotel.interfaceImp.Management;
import vn.edu.likelion.hotel.model.Borrower;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BorrowerManagement implements Management {

    static ArrayList<Borrower> borrowersArrayList = new ArrayList<>();

    public BorrowerManagement(){
        borrowersArrayList.add(new Borrower(1,1,"NameBorrower1",20,LocalDate.now(),"2024-07-27"));
        borrowersArrayList.add(new Borrower(2,2,"NameBorrower2",20,LocalDate.now(),"2024-08-27"));
        borrowersArrayList.add(new Borrower(3,3,"NameBorrower3",20,LocalDate.now(),"2024-09-27"));
    }


    @Override
    public void showAll() {
        for (Borrower borrower : borrowersArrayList) {
            System.out.println(borrower);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Borrower ID: ");
        int id_borrower = scanner.nextInt();
        System.out.println("Enter Borrower STT: ");
        int stt_borrower = scanner.nextInt();
        System.out.println("Enter Borrower Name: ");
        String name_borrower = scanner.next();
        System.out.println("Enter Borrower Age: ");
        int age_borrower = scanner.nextInt();
        //Ngay cho thue la ngay hien tai khi tao nguoi thue
        LocalDate borrower_date = LocalDate.now();
        System.out.println("Enter Borrow return Date: ");
        String return_date = scanner.next();
        Borrower borrower = new Borrower(id_borrower,stt_borrower,name_borrower,age_borrower,borrower_date,return_date);
        borrowersArrayList.add(borrower);
    }

    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Borrower ID: ");
        int id_borrower = sc.nextInt();
        for (Borrower borrower: borrowersArrayList){
            if (id_borrower == borrower.getId_borrower()){
                System.out.println("Enter Borrower Name: ");
                borrower.setName_borrower(sc.next());
                System.out.println("Enter Borrower Age: ");
                borrower.setAge_borrower(sc.nextInt());
                System.out.println("Enter Return Date: ");
                borrower.setReturn_date(sc.next());
                System.out.println("Updated Book: " + borrower);
                return;
            }
        }
        System.out.println("Borrower not found.");
    }
}
