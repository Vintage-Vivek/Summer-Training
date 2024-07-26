package W2.D9F;

import java.util.Scanner;

public class Transpose {
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
    static int[][] transpose(int[][] arr){
        int [][] nums = new int [arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               nums [j][i]= arr [i][j];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [][] arr = new int [5][5];
        intsert (arr);
        // display (arr);
        display(transpose(arr));
    }
    
}
