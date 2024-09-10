package W7.D23F;

public class bankUser {
    public static void main(String[] args) {
        Bank SBI = new Bank();
        SBI.exist = true;
        SBI.AccNo = 25;
        SBI.Balance=1000000000;
        System.out.println(SBI.Balance);
        //SBI.Withdraw(9);
        System.out.println(SBI.Balance);

        System.out.println(SBI.AccNo);
    }
}
