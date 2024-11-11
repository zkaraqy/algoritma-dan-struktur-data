package LList;

/**
 *
 * @author Azka
 */
public class Main {

    public static void main(String args[]) {
        Node head = new Node(5);
        Node baru = new Node(10);
        head.next = baru;

        AddAkhir tambah = new AddAkhir();
        Telusur telusur = new Telusur();
        head = tambah.insert(head, 20);
//        head = tambah.insert(head, 40);
        telusur.printList(head);
        
        AddDepan add = new AddDepan();
        head = add.insert(head, 7);
        telusur.printList(head);
        
        DeleteNode hapus = new DeleteNode();
        head = hapus.deleteNode(head, 20);
        telusur.printList(head);
        
        AddSisip sisip = new AddSisip();
        head = sisip.insert(head, 5, 50);
        telusur.printList(head);
        
        head = hapus.deleteNode(head, 7);
        
        telusur.printList(head);
    }
}
