package Day2;
import java.util.Scanner;
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        System.out.println(" ");
        int n= 5;

        // * * * * *  
        // * * * * *  
        // * * * * *  
        // * * * * *  
        // * * * * * 

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                 System.out.print("* ");
            }
            System.out.println(" ");
        }
       System.out.println(" ");
    }  
}
