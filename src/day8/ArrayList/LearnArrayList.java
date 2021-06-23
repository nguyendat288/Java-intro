package day8.ArrayList;

import day8.ArrayList.Animal;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        Animal a=animals.get(0);
        animals.remove(2);
        animals.set(2,new Animal());
        System.out.println("Arraylist has size "+animals.size());
        Animal[] arr =new Animal[5];
        animals.toArray(arr);
        System.out.println("Arraylist has size "+arr.length);
    }
}
