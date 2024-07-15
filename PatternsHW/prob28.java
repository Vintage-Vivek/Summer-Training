package PatternsHW;

public class prob28 {
//         1
//       2 3 2
//     3 4 5 4 3
//   4 5 6 7 6 5 4
// 5 6 7 8 9 8 7 6 5
    public static void main(String[] args) {
        int n = 5;
        System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");

                num++;
            }
            num -= 2;
            for (int j = 2; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();

        }
    }
    
}
