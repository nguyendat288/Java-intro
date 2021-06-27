package day14.Test;

import java.util.ArrayList;

public class InsertList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(6);
        insertionSort(list);
        for (int x:list){
            System.out.println(x);
        }
    }
    public static void insertionSort(ArrayList<Integer> list){
        int pos, x;
        for(int i = 1; i < list.size(); i++){ //đoạn array[0] đã sắp xếp
            x = list.get(i);
            pos = i;
            while(pos > 0 && x < list.get(pos-1)){
                list.set(pos, list.get(pos-1)); // đổi chỗ
                pos--;
            }
            list.set(pos,list.get(x));
        }
    }

}
