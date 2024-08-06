package W4.D15F;

public class Recursion {
    static void tosstail(int n, String ans){
        if (n==0) {
            System.out.println(ans);
            return;
        }
        tosstail(n-1, ans+"H");
        tosstail(n-1, ans+"T");
    }
    public static void main(String[] args) {
    tosstail(3, "");
    }
}
