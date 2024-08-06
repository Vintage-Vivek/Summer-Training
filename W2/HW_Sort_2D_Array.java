package W2;
import java.util.*;

public class HW_Sort_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,3,2,2},
                       {2,3,2,1},
                       {4,3,2,1}};
        int [] khali = new int[(arr[0].length)*(arr.length)]; 
        int index = 0;                                     // del in down loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                khali [index] = arr[i][j];
                index++;                                   // del in down loop
            }
            
        }           
        Arrays.sort(khali);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = khali [((arr[0].length*i)+j)]; // sir's method
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

// static int[] flatArray(int[][] arr){ 

//      int rows= arr.length, cols= arr[0].length; 
//    int[] nums= new int[rows*cols]; 
//     for(int i=0;i<rows;i++) 
//       for(int j=0;j<cols;j++) 
//     nums[arr[0].length*i+j]= arr[i][j]; 
//     return nums; 
//     } 
    
//       static void fillArray(int[][] arr, int[] nums){ 
//     for(int i=0;i<nums.length;i++) 
//       arr[i/arr[0].length][i%arr[0].length]=nums[i]; 
//       } 
    
//      static void display(int[] nums){ 
//     for(int i:nums) 
//       System.out.print(i+" "); 
//     System.out.println(); 
    
// } 
// static void display2D(int[][] arr){ 

//         for(int i=0;i<arr.length;i++) 
//           display(arr[i]); 
//       } 
//       public static void main(String[] args) { 
//         int[][] arr= { 
//           {2,4,2,5}, 
//           {4,5,2,4}, 
//           {9,7,1,7} 
//     }; 
    
//         int[] nums= flatArray(arr); 
//         Arrays.sort(nums); 
//         fillArray(arr,nums); 
//         display2D(arr); 
//         // display(nums); 
    
// } 