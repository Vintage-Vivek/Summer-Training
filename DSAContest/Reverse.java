// Take N as input, Calculate it's reverse also Print the reverse.

// Input Format
// Constraints
// 0 <= N <= 1000000000

// Output Format
// Sample Input
// 123456789
// Sample Output
// 987654321
// Explanation
// You've to calculate the reverse in a number, not just print the reverse.

	



package DSAContest;
//import java.util.*;
//import java.util.Scanner;
public class Reverse {
    public static int ReverseInt(int n){
        int temp = 0;
        while (n!=0){
            temp = temp*10+ n%10;
            n/=10;
        }
        return temp;
    }
    public static void main(String args[]) {
		//Scanner sc = new Scanner (System.in);
        //int n = sc.nextInt();
        //System.out.println(ReverseInt(n));
    }
}
