package W3.D12F;

public class Strings {
    //har ek character ka sucessor dena ek string me 
    public static void main(String[] args) {
        String input = "gaurav";
        String result = changename(input);
        System.out.println("Successors: " + result);
        
    }
    public static String changename(String input) {
     StringBuilder successors = new StringBuilder();
        for (char ch : input.toCharArray()) {
         int unicodeValue = (int) ch; // Get Unicode value
         char successorChar = (char) (unicodeValue + 1); // Convert back to character
         successors.append(successorChar);
        }
        return successors.toString();
    }
    
}
