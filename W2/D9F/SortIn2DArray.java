package W2.D9F;

import java.util.Arrays;

public class SortIn2DArray {

    public static void sortbyCol(int [][] arr, int col) {
     Arrays.sort(arr,(a,b)->Integer.compare(a[col],b[col]));
    }

    static void sortallRows(int arr[][]){
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
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
        int[][] arr = {
            {2,4,2,5},
            {4,5,2,4},
            {9,7,1,7}
        };
        //sortbyCol(arr, 2);
        sortallRows(arr);
        display(arr);
    }
    
}
