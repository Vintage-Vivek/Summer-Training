public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }

    static void reverse(int[] a, int n) {
        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        System.out.println("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }

    }

    


}
