package queue;

public class Queue {

    int size = 4;
    int arr[] = new int[size];

    int front = -1;
    int rear = 0;

    public void enQueue(int enQue) {
        if (front < size - 1) {
            front++;
            arr[front] = enQue;
            System.out.println("Tambah Niai " + enQue);
            displayQue();
        } else {
            System.out.println("Full Queue");
        }
    }

    public void deQueue() {
        if (front >= rear) {
            rear++;
            System.out.println("Ambil " + arr[rear - 1]);
            displayQue();
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public boolean isEmpty() {
        return front == rear - 1;
    }

    public boolean isFull() {
        return rear == size;
    }

    public void displayQue() {
        if (front >= rear) {
            System.out.print("Queue : ");
            for (int i = rear; i <= front; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
    }

}
