package day8.Test1;

import java.util.Arrays;
import java.util.Scanner;

public class ManagerBook {
static Book[] books=new Book[0];
static Scanner sc= new Scanner(System.in);
    public static void insert(){
        System.out.print("id ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.print("name ");
        String name=sc.nextLine();
        System.out.print("athor ");
        String athor=sc.nextLine();
        Book book1=new Book(id,name,athor);
        Book[] newbook =new Book[books.length+1];

        for (int i = 0; i < books.length; i++) {
            newbook[i] = books[i];
        }
        newbook[books.length] = book1;
        books = newbook;

    }
    public static int fillByName(String name){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public static void remove(String name){
        Book[] book2=new Book[books.length-1];
        for(int i=0;i<books.length;i++){
            if(books[i].getName().equals(name)){
                for(int j=0;j< books.length;j++){
                 if(j<i){
                     book2[j]=books[i];
                 }else {
                     book2[j]=books[i+1];
                 }
                }

            }
            break;
        }
    }
    public static void update(int index){
        System.out.print("id ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.print("name ");
        String name=sc.nextLine();
        System.out.print("athor ");
        String athor=sc.nextLine();
        Book book1=new Book(id,name,athor);
        books[index] = book1;
    }
    public static void search(String name){
        int index = fillByName(name);
        if (index>= 0){
            books[index].Display();
        }else {
            System.out.println("không có tên là : " + name);
        }
    }
    public static void sort(){
        Arrays.sort(books);

    }
}
