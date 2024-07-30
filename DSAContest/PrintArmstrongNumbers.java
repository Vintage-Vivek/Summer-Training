/* Take the following as input.

A number (N1)
A number (N2)
Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Constraints
0 < N1 < 100 N1 < N2 < 10000

Output Format
Sample Input
400
1000
Sample Output
407
Explanation
Each number in output is in separate line. */
package DSAContest;

public class PrintArmstrongNumbers {
    /* import java.util.*;
import java.util.Scanner;
public class Main {

	static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        return sum == originalNum;
    }

	
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        sc.close();

        for (int num = N1; num <= N2; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

    }
} */
    
}
