package PatternsHW;

public class Prob16 {

//        * * * * 
//      * * *
//    * *
//   *
// *
//   * *
//     * * *
//      * * * *
//        * * * * *
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {

            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();

        }
        for (int i = 1; i <=n; i++) {

            for (int k = 2; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
