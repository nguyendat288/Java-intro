package buoi4;

public class OverrdeTest {
    public String getName() {
        return "abc";
    }
}

class exame extends OverrdeTest {
    @Override
    public String getName() {
        return "def";
    }

    public static void main(String[] args) {
        OverrdeTest getName1= new OverrdeTest();
        System.out.println(getName1.getName());

        exame getName2 = new exame();
        System.out.println(getName2.getName());
    }
}




