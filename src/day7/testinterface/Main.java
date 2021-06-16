package day7.testinterface;

import sun.text.normalizer.CharTrie;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makesound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
            if (animal instanceof Tiger) {
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howtoEat());
            }
        }
        Fruit[] fruit=new Fruit[2];
        fruit[0]=new Apple();
        fruit[1]=new Oranges();
        for(Fruit x: fruit){
            System.out.println(x.howtoEat());
        }
    }

}
