package PatternsHW;

public class Prob33 {
//                   0 
//                 9 0 9 
//               8 9 0 9 8 
//             7 8 9 0 9 8 7 
//           6 7 8 9 0 9 8 7 6 
//         5 6 7 8 9 0 9 8 7 6 5 
//       4 5 6 7 8 9 0 9 8 7 6 5 4 
//     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
//   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            int count = n - i + 1;
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                if (count == 10) {
                    System.out.print("0 ");
                }

                else {
                    System.out.print(count + " ");
                    count++;
                }

            }
            for (int j = 2; j <= i; j++) {
                count--;
                System.out.print(count + " ");

            }

            System.out.println();
        }
    }
    
}
