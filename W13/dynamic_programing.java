package W13;

//leetcode q - 198 and 746

//Brute force then recursion then dp then bottoms up
//NGE pre computation
//top down - uses recursion
//bottom approch -  iterative approach and no recursion, pre-computation is done and all fibonaci are stored in array 
//and then when asked we just call it from the array


//TC - O(n) and SC - O(n) for both top down and bottom up approach


//dp store and not stored the fn
//time complexity inversly proportional to space complexity 
//spce complexity of recursion is low but time complexity i very high
//using dp array space complexity low but time complexity very high 

// where ever we apply recursion we can applly dp there 
// all topics such as graphs trees arrays ll stack queue backtracking if 4 from each done with dp all togehter it will 
// become upto 28 questions


public class dynamic_programing {
    public static int fib(int n){
        if(n==0||n==1){
        return n;
        }
        return fib(n-1)+fib(n-2);
    }
    //dp top down approach
    public static int fibo(int n, int [] dp){
        if(n==0||n==1){
        return n;
        }
        //check if already stored
        if (dp[n]!=0) {
            return dp[n];
        }
        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
    }
    //dp by bottoms up approach
      //have to change only f array ko dp array se toh it will become bottoms up approach
    public static int fiboBu(int n){
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    
    public static void main(String[] args) {
        System.out.println(fib(5));
        int n = 2;
        System.out.println(fibo(n, new int[n+1]));
        System.out.println(fiboBu(n));
    }
}
