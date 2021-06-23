package day11.daonguoc;

import java.util.Stack;

public class daoNguocStack<T> {
     public static void reverse(int[] arr){
         Stack<Integer> stack=new Stack<>();
         for(int i=0;i<arr.length;i++){
             stack.push(arr[i]);
         }
        for(int i=0;i<arr.length;i++){
            arr[i]=stack.pop();
        }

        for(int x:arr){
            System.out.println(x);
        }
     }
    public static void main(String[] args) {
        int[] arr={1,2,412,52,32,5};
        reverse(arr);
    }
}
