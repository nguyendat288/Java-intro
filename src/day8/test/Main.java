package day8.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book[] listBook = {};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("BOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Sort");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 7) {
                break;
            }

            switch (choice) {
                case 1:
                    listBook = ManageBook.insertBook(listBook);
                    break;
                case 2:
                    listBook = ManageBook.removeBook(listBook);
                    break;
                case 3:
                    listBook = ManageBook.updateBook(listBook);
                    break;
                case 4:
                    ManageBook.searchBook(listBook);
                    break;
                case 5:
                    ManageBook.sortBook(listBook);
                    break;
                case 6:
                    ManageBook.displayBook(listBook);
                    break;
            }
        }
    }
}