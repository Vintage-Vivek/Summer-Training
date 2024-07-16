import java.util.Scanner;

public class findNumber2 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        // Generate random numbers and populate the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10) + 1;
            System.out.print(nums[i] + ", ");
        }
        System.out.println();

        // Input the number to search for
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                found = true;
                System.out.println("That number was found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("That number was not found.");
        }
        input.close();
    }

    
}
