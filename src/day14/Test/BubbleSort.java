package day14.Test;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,13,23,623,62,662,12,1};
        sapxep(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }
    public static void sapxep(int[] arr){
        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j= arr.length-1;j>i;j-- ){
                if(arr[j]>arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
