import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();
        
        
        
        
        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
        	if(stackOldestOnTop.isEmpty()){
        	for(int i=0;i<stackNewestOnTop.size();i++)
            {
            	stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        	}
            T value2 = stackOldestOnTop.peek();
            return value2;
        }
             

        public T dequeue() {
        	if(stackOldestOnTop.isEmpty()){
            for(int i=0;i<stackNewestOnTop.size();i++)
            {
            	stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        	}
            T value = stackOldestOnTop.pop();
            return value;
            }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
