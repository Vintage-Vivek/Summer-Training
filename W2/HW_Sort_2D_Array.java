package W2;
import java.util.*;

public class HW_Sort_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,3,2,2},
                       {2,3,2,1},
                       {4,3,2,1}};
        int [] khali = new int[(arr[0].length)*(arr.length)]; 
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                khali [index] = arr[i][j];
                index++;
            }
            
        }           
        Arrays.sort(khali);
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = khali [index];
                index++;
            }
            
        }
        display(arr);
    }
    public static void display(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
