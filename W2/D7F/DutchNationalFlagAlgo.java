public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        System.out.println("dutch algo");
    }
//     class Solution {
//         void swap(int[] arr,int i,int j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//         public void sortColors(int[] nums) {
//             //dutchNationalFlag algorithm
//             int low=0;
//             int mid=0;
//             int high=nums.length-1;
//             while(mid<=high){
//                 if(nums[mid]==0){
//                     swap(nums,low,mid);
//                     low++;
//                     mid++;
//                 }
//                 else if(nums[mid]==1){
//                     mid++;
//                 }
//                 else{
//                     swap(nums,high,mid);
//                     high--;
//                 }
//             }
//         }
//     }
//     // class Solution {
//     //     public void sortColors(int[] nums) {
//     //        int z=0;
//     //        int on=0;
//     //        int tw =0;
//     //        for(int i=0;i<nums.length;i++){
//     //         if(nums[i]==0){
//     //             z++;
                
//     //         }
//     //         else if(nums[i]==1){
//     //             on++;
//     //         }
//     //         else{
//     //             tw++;
//     //         }
//     //        }
//     //        for(int i=0;i<nums.length;i++){
//     //         if(z!=0){
//     //             nums[i]=0;
//     //             z--;
//     //         }
//     //         else if(on!=0){
//     //             nums[i]=1;
//     //             on--;
//     //         }
//     //         else{
//     //             nums[i]=2;
//     //             tw--;
//     //         }
            
//     //        }
//     //     }
//     // }
    
//     // class Solution {
//     //     public static int findArray(int[] arr,int b){
//     //         int c=0;
//     //         for(int i=0;i<arr.length;i++){
//     //             if (b==arr[i]){
//     //                 c++;
//     //             }
//     //         }
//     //         return c;
//     //     }
//     //     public void sortColors(int[] nums) {
//     //         int a=findArray(nums,0);
//     //         int b=findArray(nums,1);
//     //         int c=findArray(nums,2);
//     //         for(int i=0;i<a;i++){
//     //             nums[i]=0;
//     //         }
//     //         for(int i=a;i<a+b;i++){
//     //             nums[i]=1;
//     //         }
//     //         for(int i=a+b;i<a+b+c;i++){
//     //             nums[i]=2;
//     //         }
//     //     }
//     // }
    
}
