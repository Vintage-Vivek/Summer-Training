package W4.D15F;

public class HeadSbSq {
    static int subsequencescounthead(String n){
        if (n.isEmpty()) {
            return 1;
        }
        int a= subsequencescounthead(n.substring(1));
        int b= subsequencescounthead(n.substring(1));
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(subsequencescounthead("car"));
    }
}
