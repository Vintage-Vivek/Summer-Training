package W1.Day6Folder;

public class LTsolution2 {
    
    static int customFunction(int[] arr){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
    
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
    
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(customFunction(arr));
    }
    
    
}
