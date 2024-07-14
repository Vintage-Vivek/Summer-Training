package Day1;
import java.util.Scanner;

public class inputUser {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter number of your choice: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number of your choice: ");
            int b = sc.nextInt();
            System.out.print("The sum will be: ");
            int sum = a + b;
            System.out.println(sum);

        }
    
}