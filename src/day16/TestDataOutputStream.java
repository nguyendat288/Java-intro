package day16;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int[] a={1,2,4,6,32,62,1};
        try{
            FileOutputStream fout=new FileOutputStream(args[0]);
            DataOutputStream dout=new DataOutputStream(fout);
            for(int i=0;i< a.length;i++){
            dout.writeInt(a[i]);
            dout.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
