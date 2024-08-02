package W3.D13F;

public class Wrapper_class {
    public static void main(String[] args) {
        System.out.println("practicing Wrapper classes");
        /*
            # WRAPPER CLASSES
        
            Integer                          ArrayList <---->   arr = num;       
            Boolean                                    Integer
            Float                                      Boolean
            Character                                  Float
            Double                                     Double
            Long                                       <-any->
            Byte
            Short 
            
          
            # AUTOBOXING

            int s = 4;
            Integer y = s;
            System.out.println(y);

            # UNNBOXING

            Integer s = 4;
            int y = s;
            System.out.println(y);

           # different outputs

            int a = 499;
            int b = 499;
            Integer c = 499;
            Integer d = 499;
            Integer f = 45;
            System.out.println(c == d);

            # HOME WORK 
            to find how to compare the actual value of intergers in wrapper classes
            maybe :- Integer.comparedTo()
        */
        substring1("abcde");

    }
    public static void substring1(String s)
        {
            for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<=s.length();j++)
                { 
                    System.out.println(s.substring(i,j));
                }
            }
            System.out.println("");
        }
}
