package W2.D9F;

import java.util.Scanner;

public class Arrays2D {
    public static void intsert (int [][] arr) {
        int num = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = num++;
            }
        }
        sc.close();
    }
    public static void display(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               System.out.print(arr [i][j] + "  ");
               
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int [][] arr = new int [5][5];
        intsert (arr);
        display(arr);
    }    

}
