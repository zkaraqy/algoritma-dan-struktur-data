package LList;

public class DeleteNode {
    Node head;
    
    Node deleteNode(Node list, int key) {
        head = list;
        Node prev = list;
        
        if (list.next == null && list.data == key) {
            head = null;
        }
        
        if (list.next != null && list.data == key) {
            head = list.next;
        }
        
        while(list != null && list.data != key) {
            prev = list;
            list = list.next;
        }
        
        if(list != null && list.data == key) {
            prev.next = list.next;
        }
        
        return head;
    }
}
