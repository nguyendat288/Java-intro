package day8.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ManageBook {
    // Insert + Remove + Update + SearchByName + SortByName
    public static Book[] insertBook(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String Name = sc.nextLine();
        System.out.println("Enter publish date: ");
        String PublishDate = sc.nextLine();
        System.out.println("Enter author: ");
        String Author = sc.nextLine();
        System.out.println("Enter language: ");
        String Language = sc.nextLine();
        System.out.println("Enter average price: ");
        float AveragePrice = Float.parseFloat(sc.nextLine());

        Book book = new Book(ID, Name, PublishDate, Author, Language, AveragePrice);
        Book[] newListBook = new Book[listBook.length + 1];
        for (int i = 0; i < listBook.length; i++) {
            newListBook[i] = listBook[i];
        };
        newListBook[newListBook.length - 1] = book;
        return newListBook;

    }

    public static void displayBook(Book[] listBook) {
        if (listBook.length > 0) {
            for (Book book : listBook) {
                book.Display();
            }
        } else {
            System.out.println("Nothing!");
        }
    }

    public static Book[] removeBook(Book[] listBook) {
        System.out.println("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        Book[] newListBook = new Book[listBook.length - 1];
        int index = -1;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].getName().equals(Name)) {
                index = i;
                break;
            }
        }

        for (int i = index; i < newListBook.length; i++) {
            listBook[i] = listBook[i + 1];
        }

        for (int i = 0; i < newListBook.length; i++) {
            newListBook[i] = listBook[i];
        }

        return newListBook;
    }

    public static Book[] updateBook(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String Name = sc.nextLine();
        System.out.println("Enter publish date: ");
        String PublishDate = sc.nextLine();
        System.out.println("Enter author: ");
        String Author = sc.nextLine();
        System.out.println("Enter language: ");
        String Language = sc.nextLine();
        System.out.println("Enter average price: ");
        float AveragePrice = Float.parseFloat(sc.nextLine());

        Book book = new Book(ID, Name, PublishDate, Author, Language, AveragePrice);
        listBook[ID - 1] = book;
        return listBook;
    }

    public static void searchBook(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String Name = sc.nextLine();
        boolean check = false;
        int index = -1;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].getName().equals(Name)) {
                index = i;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(listBook[index]);
        } else {
            System.out.println("Not found!");
        }
    }

    public static void sortBook(Book[] listBook) {
        Book[] newListBook = listBook;
        Arrays.sort(newListBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Book book : newListBook) {
            System.out.println(book);
        };
    }
}