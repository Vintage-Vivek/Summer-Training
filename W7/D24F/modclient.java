package W7.D24F;

public class modclient {
    //one class has only 1 public file
    public static void main(String[] args) {
     //Amodifier obj=new Amodifier(); ---------> this line shows untracked value
     //Amodifier obj2=new Amodifier(); --------> this line shows untracked value
        //System.out.println(obj.val); //error when private
        //System.out.println(obj.get());
        //final int a;
        //a=14;
        //a+=12; //error
        //System.out.println(a); //in old times assign there value with keyword 
        //System.out.println(Amodifier.a); //because a is class oriented variable static
     //System.out.println(obj.a); ------------------> //this line shows untracked value
        //Amodifier.a++;
     //obj.a++; //---------------------------------> //this line shows untracked value
     //System.out.println(obj2.a); // ------------>  //this line shows untracked value
        //System.out.println(Amodifier.a);
    }
}