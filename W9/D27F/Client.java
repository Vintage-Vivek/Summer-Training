package W9.D27F;

public class Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(100);
        ll.addAtIndex(50,2);
        ll.display();
        int n = 2;
        //System.out.println(ll.removeFirst());
        //System.out.println(ll.removeEnd());
        System.out.println("hello : "+ll.remove(1));
        ll.display();
        System.out.println("Element at index passed " + n + " : " + ll.getIndex(n));
        System.out.println("Size : "+ll.size());

        System.out.println("assignment date 12 october");
    }
}
