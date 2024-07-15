package W1.Day3Folder;

public class Reverse {
    public static int ReverseInt(int n){
        int temp = 0;
        while (n!=0){
            temp = temp*10+ n%10;
            n/=10;
        }
        return temp;
    }
    public static void main(String[] args) {
        int n= 12345678;
        System.out.println(ReverseInt(n));

    }
    
}
