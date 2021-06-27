package day14.Test;

public class InsertSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array={3,51,51,6,1,67,85,1};
        insertionSort(array);
        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
