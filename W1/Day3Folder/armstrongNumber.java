package W1.Day3Folder;

public class armstrongNumber {
    public static void main(String[] args) {
        
        int m = 153; // Replace with your desired number
        System.out.println(checkArmstrong(m));
        
    }
    public static int countDigits(int m){
        int f= m;
        int x=0;
        while(f>0){
            x++;
            f/=10;
        }
        return x;

    }
    public static boolean checkArmstrong(int m){
        int a=countDigits(m);
        int sum=0;
        int b=0;
        int c = m;
        while(c>0){
            b=c%10;
            sum+=Math.pow(b,a);                         //implicit
                                                        //sum = sum +(int) Math.pow(a,b); explicit
                                                        // explicit casting is not useful not at all recommended !!!!
            b=0;
            c/=10;
        }
        if (sum==m){
            return true;
        }
        else{
            return false;
        }
    }
}

    