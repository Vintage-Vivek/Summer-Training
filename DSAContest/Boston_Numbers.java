/* A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors 
obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . 
For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. 
Write a program to check whether a given integer is a Boston number.

Input Format
There will be only one line of input:N , the number which needs to be checked.

Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)

Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.

Sample Input
378
Sample Output
1
Explanation
Self Explanatory */

package DSAContest;

public class Boston_Numbers {
    /* import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        //sum nikal liya number ki digits ka
        int num = n;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // Factorization karni hai yhan pe, 2 se isliye start kar rhe
		// taki 1 na aaye factors me
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                int k = i;
                while (k > 0) {
                    sum -= k % 10;
                    k /= 10;
                }
                n /= i;
            }
        }

        // agar sum barabar aaya prime factors k sum k toh 1 print
		// hoga nhi toh phir 0 print ho jayega 
        if (sum == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
 */
    
}
