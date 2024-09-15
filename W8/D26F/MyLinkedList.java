package W8.D26F;

public class MyLinkedList {
    // behaviour
    private Node head = null;
    //ham maan k chal rhe hain ki hamare pass ek 4 size ka array phele se he hai
    public void InsertAtBegin(int val){
        Node n1 = new Node(val);
        n1.next = head;
        head = n1;
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
   public void InsertAtEnd(int val){ // agar linkedl list khali hai toh yeh code exception throw kare ga jo hai 
    // null pointer exception
     Node temp = head;
     while (temp.next!=null) {
       temp=temp.next;
     }
     Node newNode = new Node(val);
     temp.next=newNode;
    }

}
