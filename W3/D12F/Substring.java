package W3.D12F;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the start index: ");
        int startFrom = sc.nextInt();
        System.out.print("Enter the end index: ");
        int endBefore = sc.nextInt();
        sc.close();

        String customSubstring = getCustomSubstring(input, startFrom, endBefore);
        System.out.println("Custom substring: " + customSubstring);
    }

    public static String getCustomSubstring(String str, int startFrom, int endBefore) {
        StringBuilder result = new StringBuilder(); // string builder nahi use karni chaiye thi
        for (int i = startFrom; i < endBefore; i++) {
            if (i >= 0 && i < str.length()) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

}
