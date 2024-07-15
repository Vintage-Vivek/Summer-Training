package Week1.Day3Folder;

public class PrimeNumber {
    public static boolean checkPrime(int n){
        for(int i=2; i<n; i++)
          if(n%i==0)
           return false;
        return true;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(checkPrime(n));
    }
    
}
