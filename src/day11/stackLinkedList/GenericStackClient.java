package day11.stackLinkedList;

public class GenericStackClient {
   public static void stackOfString() {
       MyGenericStack<String> stack = new MyGenericStack<>();
       stack.push("một");
       stack.push("hai");
       stack.push("ba");
       stack.push("bốn");
       stack.push("năm");
       System.out.println("Size of Stack :"+stack.size());
       while (!stack.isEmpty()) {
           System.out.printf("Các phần tử trong Stack là : %s " , stack.pop());
       }
   }
   public static void stackOfIntegers() {
       MyGenericStack<Integer> stack = new MyGenericStack();
       stack.push(5);
       stack.push(4);
       stack.push(3);
       stack.push(2);
       stack.push(1);
       System.out.println("2.1. Size of stack after push operations: " + stack.size());
       System.out.printf("2.2. Pop elements from stack : ");
       while (!stack.isEmpty()) {
           System.out.printf(" %d", stack.pop());
       }

   }
        public static void main(String[] args) {
            System.out.println("1. Stack of integers");
            stackOfIntegers();
            System.out.println("\n2. Stack of Strings");
            stackOfString();
        }

}
