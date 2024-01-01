public class PrintList {
    public static void print() {
        if (LinkedList.head == null) {
            System.out.println("List is empty!!!");
        } else {
            for (Node temp = LinkedList.head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
        }
    }
}
