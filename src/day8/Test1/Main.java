package day8.Test1;


import day8.test.ManageBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice=-1 ;
        while(choice!=7){
            System.out.println("BOOK MANAGEMENT SYSTEM");
            System.out.println("1.Insert");
            System.out.println("2.Remove");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Sort");
            System.out.println("6.Show");
            System.out.println("7.Exit");
          choice = sc.nextInt();
          switch (choice){
              case 1:
                  ManagerBook.insert();
                  break;
              case 2:
                  System.out.println("Enter name remove ");
                  String name =sc.nextLine();
                  ManagerBook.remove(name);
                  break;
              case 3:
                  System.out.println("Enter index ");
                  int index=sc.nextInt();
                  ManagerBook.update(index);
                  break;
              case 4:
                  System.out.println("Enter name ");
                  String name1 =sc.nextLine();
                  ManagerBook.search(name1);
                  break;
              case 5:
                  ManagerBook.sort();
              case 6:
                  for(Book x:ManagerBook.books){
                      x.Display();
                  }
              case 7:
                  System.exit(0);
          }
        }
    }
}
