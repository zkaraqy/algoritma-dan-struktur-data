package LList;

public class AddAkhir {
    Node head;
    
    Node insert(Node list, int data) {
        Node baru = new Node(data);
        head = list;
        if (head == null) {
            head = baru;
        } else {
            while(list.next != null) {
                list = list.next;
            }
            
            list.next = baru;
        }
        return head;
    }
}
