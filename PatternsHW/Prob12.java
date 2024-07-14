package PatternsHW;

public class Prob12 {
                //          * 
                //        * ! *
                //      * ! * ! *
                //    * ! * ! * ! *
                //  * ! * ! * ! * ! *
    public static void main(String[] args) {
            int n = 5;
        
            
            for (int i = 1; i <= n; i++) {
                
                
                for (int k = 1; k <= n - i; k++) {
                    System.out.print("  ");
                }
                for (int j1 = 1; j1 <= i; j1++) {
                    System.out.print("* ");
                    if (j1<i){
                        System.out.print("! ");
                    }
                }
                System.out.println();
               }
            }
        }
