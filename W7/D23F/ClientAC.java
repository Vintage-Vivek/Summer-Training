package W7.D23F;

public class ClientAC {
    public static void main(String[] args) {
        AC voltas = new AC(true, 25, "right", 10);
        // voltas.Start = true;
        // voltas.temp = 25;
        // voltas.swing = "Right";
        // voltas.fanspeed = 10;
        System.out.println(voltas.temp);

        AC haier = new AC(true, 25, "right", 10);
        // haier.Start = true;
        // haier.temp = 25;
        // haier.swing = "Right";
        // haier.fanspeed = 10;
        /* 
        these can be now removed as we our using our own 
        constructor which is giving values and the defalt
        constructor got replaced by this constructor  
        */ 

        System.out.println(haier.temp);
    }
}
