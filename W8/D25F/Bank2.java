package W8.D25F;

public class Bank2 {
    
    // states
    // should add access modifier later after declaring data type
    public String AccountHolder;
    public int AccountNumber;
    private int Balance; // hide and also give getters and setters to give access
    private int pinNumber;
    // rightclick source action genetrate getters and setters only private ones
    
    public Integer getBalance(int pinNumber) {
        if(this.pinNumber == pinNumber){
            return Balance;
        }else{
            return null;
        }
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setBalance(int amount, int pinNumber) {
        if (this.pinNumber == pinNumber && (Balance-amount)>=0) {
            Balance-=amount;
        }else{
            System.out.println("Amount access");
        }
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    Bank2(String AccountHolder, int AccountNumber, int pinNumber){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.pinNumber     = pinNumber;
    }

}
