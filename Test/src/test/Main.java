

package test;
//import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       Queue<Integer> queue1=new LinkedList();
        queue1.add(23);
        queue1.offer(4);
        queue1.add(5);
        queue1.offer(6);
        System.out.println("Queue content is " +queue1);
       System.out.println("****************************************************");
        LinkedList<Integer> list=new LinkedList();
        list.add(7);
        list.add(45);
        list.offer(45);
        list.add(56);
        System.out.println("list value is" +list);
         System.out.println("************************************");
        Stack<Integer> stack= new Stack();
        stack.push(340);
        stack.push(76);
        stack.push(56);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.empty();
        stack.push(56);
        System.out.println("Stack Element" +stack);
          System.out.println("**************************************");
         ArrayList<Integer> List= new ArrayList();
         List.add(56);
         List.add(67);
         List.add(67);
         List.remove(1);
         List.remove(1);
         System.out.println("Arraylist Element is" +List);
    }

}
