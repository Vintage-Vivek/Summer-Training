import java.util.Arrays;

public class SumofArray {
    public static void main(String[] args) {
         int[] nums = { 1, 2, 3, 4 };
        int sum = Arrays.stream(nums).sum();

        System.out.println(sum);
    }

    
}
