package W5.D19F;

import java.util.Stack;
import java.util.Scanner;

public class Stacks {
    static int[] NGsRE(int [] arr ){
        int[] NGE = new int [arr.length];
        Stack <Integer> stk = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stk.empty() && arr[i]>stk.peek()) {
                stk.pop();
            }
            if(stk.empty()){
                NGE[i]=-1;
            }
            else{
                NGE[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        return NGE;
    }
    static int[] NGeRE(int [] arr ){
        int[] NGE = new int [arr.length];
        Stack <Integer> stk = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stk.empty() && arr[i]<stk.peek()) {
                stk.pop();
            }
            if(stk.empty()){
                NGE[i]=-1;
            }
            else{
                NGE[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        return NGE;
    }
    public static void main(String[] args) {

        int[] user={7,3,4,5,9,2};
        int[] nums=NGeRE(user);
        //int[] nums=NGsRE(user);
        for(int n:nums){
            System.out.print(n+" ");
        }

        Scanner sc = new Scanner(System.in);

        // Stack <Integer> stk = new Stack<>(); // to allocate stack in new memory

        
        // // to add elements until a charachter is not entered
        // while (sc.hasNextInt()) {
        //     stk.push(sc.nextInt());
        // }
        // System.out.println(stk);



        // System.out.println("element found: " + stk.search(5));

        // //to find index from left side
        // System.out.println("index: "+(stk.size()-stk.search(5)));

        // // to empty stack in one go 

        // System.out.println("deleting elements: ");
        // while (!stk.isEmpty()) {
        //     System.out.println(stk.pop());
        // }
        // System.out.println("empty stack: "+stk);


        // // to take elements from user in a loop to push in stack
        // // int element = sc.nextInt();
        // // for (int i = 0; i < element; i++) {
        // //     int give = sc.nextInt();
        // //     stk.push(give);
        // // }

        // // stk.push(1);  // to add elements in stack
        // // stk.push(2);
        // // stk.push(10);
        // // stk.push(20);
        // // stk.push(100);
        // // stk.push(200);
        // // stk.pop();        // to delete elements from stack
        // // stk.pop();
        // // System.out.println(stk);
        
        // // System.out.println(stk.peek()); // to view first element
        // // System.out.println(stk.pop());  // to delete first element



        sc.close();
    }
}
