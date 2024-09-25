package W9.D27F;

public class LinkedList {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    
    //add element at first 
    public void addFirst(int item){
        Node nn = new Node();
        nn.data = item;
        if(size==0){
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        } size++;
    }
    
    //display element
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //to display size
    public int size(){
        return size;
    }

    //add element at last
    public void addLast(int item){
        
        if(size==0){
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    // function to get node
    public Node getNode(int index){
        Node temp = head;
        for(int i = 0; i < index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //function to add in between 
    public void addAtIndex(int item , int index){
        if (index==0) {
            addFirst(item);
        } else if (index == size){
            addLast(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            Node k_1th = getNode(index-1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }

    //get element 
    public int getStart(){
        return head.data;
    } 

    public int getEnd(){
        return tail.data;
    }

    public int getIndex(int index){
        if(index==0){
            return getStart();
        }else if(index == size-1){
            return getEnd();
        }else {
            return getNode(index).data;
        }
    }

    // to remove 
    public int removeFirst(){
        int rn = head.data;
        if(size == 0){
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rn;
    }

    public int removeEnd(){
        
        if(size == 1){
            return removeFirst();
        } else {
            int rn = tail.data;
            Node s1 = getNode(size-2);
            s1.next = null;
            tail= s1;
            size--;
            return rn;
        }
    }

    public int removeKth(int index){
        if(index == 1){
            return removeFirst();
        } else if (index == size-1) {
            return removeEnd();
        } else {
            Node first = getNode(index-1);
            Node temp = first.next;
            first.next = temp.next;
            temp.next = null;
            size--;
            return temp.data;
        }
    }

    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("gaurav sir cntinu");

    }
}
