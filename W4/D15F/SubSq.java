package W4.D15F;

public class SubSq {
    static void Subsequence(String n,String ans){
        if (n.isEmpty()) {
            System.out.println(ans);
            return;
        }
        //int i = 0;
        Subsequence(n.substring(1,n.length()),ans+n.charAt(0));
        Subsequence(n.substring(1,n.length()),ans);
    }

    public static void main(String[] args) {
        Subsequence("car","");
    }
    
}
