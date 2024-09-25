package W8.D26F;

public class client {
    public static void main(String[] args) {
        //creating linklist with constructor
        Node n1 = new Node(12);
        Node n2 = new Node(13);
        Node n3 = new Node(14);
        
        //linking
        //giving name to buckets
        Node Head = n1;
        Node temp = n2;
        //changing bucket name
        temp = n3; // if mistakenly gave wrong name then it can be changed by this method
        temp = n2.next; // shifting // next bas aage wale ko link karne k liye use kiye hain 
        //warna naam toh uske bina bhi change ho jayega

        //assigning addresses
        n1.next = n2;
        n2.next = n3;

        //printing addresses
        System.out.println(Head);
        System.out.println(temp);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1.next);
        System.out.println(n2.next);
    }
}
