package day7.testinterface;

public class Tiger extends Animal implements Edible{
    @Override
    public String makesound(){
        return "gru gru";
    }

 @Override
    public String howtoEat(){
        return "meat";
 }
}
