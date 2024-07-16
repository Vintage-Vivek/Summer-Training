import java.util.Scanner;

public class checkingIndex {
       


    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4};

        System.out.println("Array elements:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}