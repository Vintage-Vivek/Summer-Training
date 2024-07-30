/* Take sb (source number system base), db (destination number system base) and sn (number in source format). 
Write a function that converts sn to its counterpart in destination number system. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000
sb and db <= 10

Output Format
Sample Input
8
2 
33
Sample Output
11011
Explanation
All input output is as integers and in separate lines. */

package DSAContest;

public class Conversion_AnyToAny {
    /* import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sb = scn.nextInt(); // Source base
        int db = scn.nextInt(); // Destination base
        String sn = scn.next(); // Number in source format

        String result = convertNumberToNewBase(sn, sb, db);
        System.out.println(result);
    }

    public static String convertNumberToNewBase(String number, int base, int newBase) {
        return Integer.toString(Integer.parseInt(number, base), newBase);
    }
}



// Scanner scn = new Scanner(System.in);
// 		int n = scn.nextInt();
// 		int t = scn.nextInt();

// 		int p = 0, res = 0;

// 		while (n != 0) {
//     		int digit = n % 10;
//     		res = res + (int) Math.pow(t, p) * digit;
//     		n = n / 10;
//   		  p++;
// 		}

// 		System.out.println(res); */

}
