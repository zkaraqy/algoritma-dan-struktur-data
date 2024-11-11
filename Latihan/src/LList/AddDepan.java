package LList;

public class AddDepan {

    Node head;

    Node insert(Node list, int data) {
        Node baru = new Node(data);
        baru.next = null;

        head = list;

        if (head == null) {
            head = baru;
        } else {
            baru.next = head;
            head = baru;
        }
        return head;
    }
}
