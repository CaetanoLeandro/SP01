package stackvsqueue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        //STACK
        Stack<String> stack  = new Stack<>();

        System.out.println("");
        System.out.println("==========================");
        System.out.println("STACK");

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);

        System.out.println("1°" + stack.peek());
        System.out.println("removed " + stack.pop());

        //QUEUE
        Queue<String> queue = new LinkedList<>();

        System.out.println("");
        System.out.println("==========================");
        System.out.println("QUEUE");

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);
        System.out.println("1°" +queue.peek());
        System.out.println("removed " + queue.poll());

    }
}
