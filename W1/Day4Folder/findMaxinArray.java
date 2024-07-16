public class findMaxinArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50 };
        int max = array[0]; // Assume array[0] to be the max for time-being

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Largest is: " + max);
    }
}