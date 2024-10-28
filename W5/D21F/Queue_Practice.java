package W5.D21F;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Practice {

    // leetcode question 232 and 235
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        // queue.add(1);

        // if we use offer and queue is full it will return bollean value
        queue.offer(1);

        // queue.add(10);
        // queue.add(100);
        // queue.add(1000);
        // System.out.println(queue);
        // queue.remove(10);
        System.out.println(queue);
        //display peek
        System.out.println(queue.peek());
        // can be used same as peek 
        // the main differecne is that in empty queue peek return null and element return exception
        // System.out.println(queue.element());



    }
    
}

/*  
queue is daynamic data structure 

queue dynamic 90 percent 10 percent static

its FIFO -----> first in first out

operations :- 
1) addiding values
2) remove
3) front

*/
