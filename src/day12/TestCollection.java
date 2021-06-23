package day12;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList collection1=new ArrayList();
        collection1.add("Hà Nội");
        collection1.add("New York");
        collection1.add("Paris");
        collection1.add("Béclin");
        collection1.add("Dallas");
        System.out.println("collection 1 : "+collection1);
        System.out.println("\nIs New York in collection1? "
                + collection1.contains("New York"));
        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() +
                " cities are in collection1 now");

        ArrayList collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        ArrayList c1 = (ArrayList) collection1.clone();
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = (ArrayList)(collection1.clone());
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (ArrayList)(collection1.clone());
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }
}
