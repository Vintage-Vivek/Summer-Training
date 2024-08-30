package W6.D22F;

//java is a two phase system
 
public class Revision {
    public static void main(String[] args) {
        int a = 12;
        if (a==12) {
        int val = 13;
        System.out.println(val);
        System.out.println(a);
        }
        System.out.println(++a);


    }

}

// jab bhi fn call hoga toh use memory allocate hogi
// if we call one fn in another fn then in which fn we are it goes to pausing state and runs the fn which we called 
