package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if(string.equals("a")) {
                iterator.remove();

            }
        }
        for(String x: list){
            System.out.println(x);
        }
    }
}
