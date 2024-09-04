package W7;

public class Bank {
    //state 
    boolean exist;
    int AccNo;
    String Name;
    int Balance; 
    
    //Behaviour
    void doExist(){
        if (exist==true) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    void Deposit(int amount){
        Balance = amount+Balance;
    }
    void withdraw(int amount){
       if (Balance==0) {
        return;
       } Balance = amount+Balance;
    }
    
    
    
}
