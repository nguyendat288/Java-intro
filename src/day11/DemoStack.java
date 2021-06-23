package day11;

import As.As;

import java.util.Stack;
import java.util.Collections;
public class DemoStack {
    public static void main(String[] args) {
        Stack s=new Stack();
//        push():thêm phần tử vào đầu stack
        s.push(1);
        s.push("hi");
        s.push("how are you today");
        s.push("where are you going ");
//        peek():trả về phần tử ở đầu Stack, và ko xoá phần tử này;
        System.out.println(s.peek());
//        pop():lấy ra phần tử ở đầu Stack và đồng thời xoá nó khỏi Stack;
        System.out.println(s.pop());
//        search():trả về vị trí cần tìmm tình từ đầu Stack
        System.out.println(s.search("hi"));
//        size():trả về kích thước của Stack;
        System.out.println("size : "+s.size());
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
