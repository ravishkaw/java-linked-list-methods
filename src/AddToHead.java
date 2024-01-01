public class AddToHead {
    public static void addToHead(int val) {

        Node newNode = new Node(val);

        if (LinkedList.head == null) {
            LinkedList.head = newNode;
            LinkedList.tail = newNode;
        } else {
            newNode.next = LinkedList.head;
            LinkedList.head = newNode;
        }

    }
}
