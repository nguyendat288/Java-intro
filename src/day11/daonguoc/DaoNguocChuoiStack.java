package day11.daonguoc;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoiStack {
    public static void reverse(String[] words){
        Stack<String> stack=new Stack<>();
        for(int i=0;i<words.length;i++){
            stack.push(words[i]);
        }
        for(int i=0;i<words.length;i++){
            words[i]=stack.pop();
        }

        for(String x:words){
            System.out.println(x);
        }
    }
            public static void main(String args[]) {
                String s1 = "Hello world!";
                String[] words = s1.split(" ");
               reverse(words);
            }
        }

