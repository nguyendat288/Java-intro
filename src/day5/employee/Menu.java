package day5.employee;

import java.util.Scanner;
public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void addStudent(Student[] arr, int k) {
        System.out.print("Enter id ");
        int id=sc.nextInt();
        System.out.print("Enter name ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.print("ENter the gender ");
        String gender=sc.nextLine();
        System.out.print("Enter the age ");
        int age=sc.nextInt();
        Student newStudent = new Student(id, name, gender, age);
        arr[k] = newStudent;
    }

    public static void changeInfo(Student[] arr, int id) {

    }

    public static Student[] removeStudent(Student[] arr, int id) {
        Student[] newArr = new Student[arr.length - 1];
        int i = 0;
        int j = 0;

        for (i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                break;
            }
        }

        for (int k = 0; k < newArr.length; k++) {
            if (k < i) {
                newArr[k] = arr[k];
            }
            if(k >= i) {
                newArr[k] = arr[k+1];
            }
        }
        return newArr;
    }

    public static Student findStudent(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                return arr[i];
            }
        }
        return null;
    }
}
