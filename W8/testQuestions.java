package W8;
public class testQuestions {

    //QUESTION 1

    //     Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

// Input Format
// The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

// Constraints
// Length of the arrays should be between 1 and 1000.

// Output Format
// Print all the pairs of numbers which sum to target. Print each pair in increasing order.

// Sample Input
// 5
// 1
// 3
// 4
// 2
// 5
// 5
// Sample Output
// 1 and 4
// 2 and 3
// Explanation
// Find any pair of elements in the array which has sum equal to target element and print them.
    // public static void main(String args[]) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int[] d=new int[n];
    //     if(n<=1000 && n>=1){
    //         for(int i=0;i<n;i++){
    //             d[i]=sc.nextInt();
    //         }
    //         int target=sc.nextInt();
    //         int k;
    //         for(k=0;k<d.length;k++){
    //             for(int i=k+1;i<d.length;++i){
    //                 if((d[k]+d[i])==target){
    //                     if(d[k]<d[i]){
    //                         System.out.println(d[k]+" and "+d[i]);
    //                     }
    //                     if(d[i]<d[k]){
    //                         System.out.println(d[i]+" and "+d[k]);
    //                     }
    //                 }
    //             }
    //         }
    //     }
    // }

    // QUESTION 2
    //     Rajesh Bhaiya, known for his love of puzzles, faced an interesting challenge. One day, while sipping tea, his friend Monu Bhaiya handed him two numbers, 𝑎 and 𝑏. " Rajesh Bhaiya, " Monu Bhaiya, "you can only increase 𝑎 by 1 in each move. Your task is to figure out how many moves you need to make 𝑎 divisible by 𝑏.

// Input Format
// The first line of the input contains one integer 𝑡 (1≤𝑡≤10^4) — the number of test cases. Then 𝑡 test cases follow.
// The only line of the test case contains two integers 𝑎 and 𝑏 ( 1≤𝑎,𝑏≤10^9 ).
// Constraints
// 𝑡 (1≤𝑡≤10^4)
// 𝑎 and 𝑏 ( 1≤𝑎,𝑏≤10^9 ).
// Output Format
// For each test case print the answer — the minimum number of moves you need to do to make 𝑎 divisible by 𝑏.

// Sample Input
// 5
// 10 4
// 13 9
// 100 13
// 123 456
// 92 46
// Sample Output
// 2
// 5
// 4
// 333
// 0
// Explanation
// Self Explanatory
    // public static void main (String args[]) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     for(int i=0;i<a;i++){
    //         //Scanner scan=new Scanner(System.in);
    //         int b=sc.nextInt();
    //         int c=sc.nextInt();
    //         int k=0;
    //         for(int j=0;j<b+c;j++){
    //             if(b%c!=0){
    //                 b+=1;
    //             }
    //             else{
    //                 System.out.println(j);
    //                 break;
    //             }
    //         }
    //         //System.out.println(k);
    //     }
    // }


}
