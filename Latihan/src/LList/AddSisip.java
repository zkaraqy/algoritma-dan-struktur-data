package LList;

public class AddSisip {
    Node head;
    Node insert(Node list, int x, int y) {
        Node baru = new Node(y);
        head = list;
        while (list.next != null) {            
            if(list.data == x) {
                baru.next = list.next;
                list.next = baru;
            }
            list = list.next;
        }
        return head;
    }
}
