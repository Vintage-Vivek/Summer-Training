public class DryRunTest{
    public static void dryRunThis(int[] arr){
        for(int turn= 1;turn<arr.length;turn++){
           for(int i=0; i<arr.length-turn;i++){
              if(arr[i]>arr[i+1]){
                 int temp=arr[i];
                    arr[i]=arr[i+1];
                        arr[i+1]=temp; 
    
                }
            }
        } 
    }
}