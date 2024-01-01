public class LinkedList {

    public static Node head;
    public static Node tail;




    public static void main(String[] args) {
        System.out.println("Linked List Methods\n-----------------------------------------");

        AddToHead.addToHead(10);
        AddToHead.addToHead(20);
        AddToHead.addToHead(50);
        AddToHead.addToHead(80);
        PrintList.print();
    }
}