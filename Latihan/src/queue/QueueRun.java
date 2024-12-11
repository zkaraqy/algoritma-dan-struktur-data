/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author USER
 */
public class QueueRun {
    public static void main(String[] args) {
        Queue que = new Queue();
        
        System.out.println("isi kosong ? " + que.isEmpty());
        System.out.println("isi penuh ? " + que.isFull());
        que.enQueue(23);
        que.enQueue(40);
        que.enQueue(59);
        que.enQueue(78);
        System.out.println("");
        System.out.println("isi kosong ? " + que.isEmpty());
        System.out.println("isi penuh ? " + que.isFull());
        
        que.deQueue();
        que.deQueue();
        que.deQueue();
        System.out.println("");
        System.out.println("isi kosong ? " + que.isEmpty());
        System.out.println("isi penuh ? " + que.isFull());
    }
    
}
