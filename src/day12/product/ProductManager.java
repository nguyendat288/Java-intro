package day12.product;

import day12.sapXep.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
   static Scanner sc=new Scanner(System.in);
   static List<Product> product1=new ArrayList<>();
   static Product product=new Product();
    public static void add(){
        System.out.println("Enter the id ");
        int id =Integer.parseInt(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the name ");
        String name=sc.nextLine();
        product1.add(new Product(id,name));
    }
    public static void fix(){
        System.out.println("Enter the id to edit :");
        int id1=Integer.parseInt(sc.nextLine());
        System.out.println("==========//fix//=============");
        System.out.println("Enter the new name ");
        String name1=sc.nextLine();
        int index= product1.indexOf(id1);
        product1.set(index,new Product(id1,name1));
    }

}
