package W1.Day6Folder;

public class RotateArrayLT {
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        for (int i = 0; i < n; i++) {
            if (i < k) {
                System.out.print(nums[n + i - k] + " ");
            } else {
                System.out.print(nums[i - k] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(nums, k);
    }
    
    
}
