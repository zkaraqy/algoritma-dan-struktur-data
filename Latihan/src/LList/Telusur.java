package LList;

public class Telusur {

    public void printList(Node n) {
        while(n != null) {
            System.out.print("[" + n.data + "] -> ");
            n = n.next;
        }
        System.out.println("[null]");
    }
}
