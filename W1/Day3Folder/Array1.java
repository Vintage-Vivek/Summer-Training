package Week1.Day3Folder;

public class Array1 {
    public static void display(int[] arr){
        for (int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
    }
    public static void main(String[] args) {

        // int[] arr = new int[10];
        // System.out.println(arr);
        // char[] arr = new char[10];
        // String s;
        // arr [0]= 'a';
        // arr [1]= 'a';
        // arr [2]= 'a';
        // to display array
        // int i;
        
        int[] arr= new int [10];       
        arr [0]= 100;
        arr [3]= 'a';
        arr [6]= 'a';
        display(arr);
    }
    
}
