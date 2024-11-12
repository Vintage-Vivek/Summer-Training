package W8.D26F;

public class LinkedList {
    public static void main(String[] args) {
        //int size=(int)1e10; //10^10 //in java-around 10^6
        //int[] d=new d[size]; error because array has restriction that if it takes memory so it will take continous memory only
        Node n1=new Node(12);
        Node n2=new Node(13);
        Node n3=new Node(13);
        Node head=n1;
        Node temp=n2;
        //temp=n3; //shifting but forward
        //If by mistake temp n2 but had to do n3 so the above is the code
        temp=n2.next; //shifting
        n1.next=n2;
        n2.next=n3;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1.next);
        System.out.println(n2.next);
    }
}
