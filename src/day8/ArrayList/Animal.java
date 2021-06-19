package day8.ArrayList;

public class Animal {
    private String name;
    protected float weight;
    private int age;
    protected void saySomeThing(){
        System.out.println("bla... bla....");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){}
    public void move(){
        System.out.println("Animal is moving ....");
    }
}
