package stack;

public class Stack {
    
    private int arr[];
    private int top;
    private int capacity;
    
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int x) {
        if(isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Menambahkan " + x);
        arr[++top] = x;
    }
    
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Kosong");
            System.exit(1);
        }
        int poppedItem = arr[top--];
        System.out.println("Mengeluarkan " + poppedItem);
        return poppedItem;
    }
    
    public int getSize() {
        return top + 1;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void show() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(2);
        
        System.out.print("Stack : ");
        stack.show();
        System.out.println("");
        
        stack.pop();
        stack.pop();
        
        System.out.print("Stack setelah pop : ");
        stack.show();
        System.out.println("");
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

}
