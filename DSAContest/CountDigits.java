// Take the following as input.
// A number
// A digit
// Write a function that returns the number of times digit is found in the number. Print the value returned.

// Input Format
// Integer (A number) Integer (A digit)

// Constraints
// 0 <= N <= 1000000000 0 <= Digit <= 9

// Output Format
// Integer (count of times digit occurs in the number)

// Sample Input
// 5433231 
// 3
// Sample Output
// 3
// Explanation
// The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
package DSAContest;
import java.util.Scanner;

public class CountDigits {
	static int countOccurrences(int x, int d){
		int count = 0;
		while (x > 0){
			if (x % 10 == d){
            count++;
			}
            x = x / 10;
		}
		return count;
	}
	
	 public static void main(String args[]) {
		 Scanner sc = new Scanner (System.in);
		 int x = sc.nextInt();
		 int d = sc.nextInt();
		 System.out.println(countOccurrences( x,d));
         sc.close();
		 

    }
}

