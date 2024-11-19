package ReverseKata;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stackChar = new Stack<>();
        System.out.print("Input  : ");
        String teks = scan.nextLine();
        for (int i = 0; i < teks.length(); i++) {
            stackChar.push(teks.charAt(i));
        }
        System.out.print("Output : ");
        String teksTereverse = "";
        while (!stackChar.isEmpty()) {            
            teksTereverse += stackChar.pop();
        }
        System.out.println(teksTereverse);
    }
}
