package PatternsHW;

public class Prob31 {
// 5 4 3 2 * 
// 5 4 3 * 1
// 5 4 * 2 1
// 5 * 3 2 1
// * 4 3 2 1
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j==n+1){
                    System.out.print("* ");
                }else{
                System.out.print(n-j+1 +" ");}
            }
            System.out.println();
        }
    }
    
}
