package LinkedListImp;

public class Runner {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.show();

        list.deleteAt(3);
        System.out.println(" ");
        list.show();



    }

}

