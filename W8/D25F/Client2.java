package W8.D25F;

import W8.D26F.MyLinkedList;

public class Client2 {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        // list.InsertAtBegin(12);
        // list.InsertAtBegin(13);
        // list.InsertAtBegin(14);
        // list.display();
        // System.out.println();
        // list.display();
        list.InsertAtEnd(100); //if list isEmpty then null pointer exception corner case
        System.out.println();
        list.display();
    }
}
