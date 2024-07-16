import java.util.Scanner;

public class findNumber {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Give arrey length: ");
        int length = sc.nextInt();

        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        sc.close();
    }
}