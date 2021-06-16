package day7.testinterface;

public class Chicken extends Animal implements Edible{
     @Override
    public String makesound(){
         return "cục tác";
     }
     @Override
    public String howtoEat(){
         return "rice";
     }
}
