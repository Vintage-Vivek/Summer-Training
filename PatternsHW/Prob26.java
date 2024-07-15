package PatternsHW;

public class Prob26 {
    public static void main(String[] args) {

//            1  
//          1 2 3  
//        1 2 3 4 5  
//      1 2 3 4 5 6 7  
//    1 2 3 4 5 6 7 8 9 
int n = 5;

  for (int i = 1; i <= n; i++) {
    for (int k = 1; k <= (n - i); k++) {
        System.out.print("  ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
    }
    }
    

}
