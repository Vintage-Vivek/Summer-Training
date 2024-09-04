package W7;

public class AC {
    
    //state 

    boolean Start;
    int temp;
    String swing;
    int fanspeed;
    
    // AC(){ // non parameterised
             // default constructor
    // }
    
    AC(boolean val1, int val2, String val3, int val4){ // parameterised
        Start = val1;                                  // constructor
        temp = val2;
        swing = val3;
        fanspeed = val4;
    }

    
    //Behaviour
    void SwitchMode(){
        if (Start==true) {
            Start = false;
        }else{
            Start= true;
        }
    }
    void Increase(){
        if(temp==30){
            return;
        }
        temp++;
    }
    void Decrease(){
        if(temp==16){
            return; // conditional return
        }
        temp--;
    }
}
