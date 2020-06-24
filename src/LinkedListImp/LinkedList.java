package LinkedListImp;

public class LinkedList {


    public class Node {
        int data ;
        Node next ;

    }

    Node head;



    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null ) {

            head = node ;

        }else
        {

            Node n = head;
            while(n.next != null) {
                n =n.next;
            }

            n.next = node;


        }



    }

    public void insertAtStart(int data)
    {

        Node node = new Node();

        node.next = null;
        node.data = data;

        node.next = head;
        head = node;



    }

    public void deleteAt(int index) {

        Node n = head;

        if(index == 0) {

            head = head.next;
        }

        for(int i=0 ; i<index-1; i++) {
            n = n.next;

        }
        n.next = n.next.next;



    }

    public void show() {
        Node n = head;

        while(n.next!= null) {
            System.out.print(n.data);
            System.out.print(" ");
            n = n.next;

        }System.out.print(n.data);


    }

    public int lenght() {
        int count = 0;
        Node n = head;

        while(n.next!=null) {
            n = n.next;
            count++;
        }return count+1;



    }

    public int getNthElementFromLast(int n ) {

        Node n1 = head;
        int pos =lenght() - n;
        if (n>lenght()) {
            System.out.println("The n is Greater than Lenght of the List");
            throw new IllegalArgumentException("g");
        }
        int count = 0 ;
        while(count < pos) {
            n1 = n1.next;
            count++;

        }
        //System.out.println(n1.data);
        return n1.data;


    }

}