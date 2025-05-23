package justin.java17.samples.CH04.ClassObject.src.cc.openhome;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var number = (int) (Math.random() * 10);
        var guess = -1;
        
        do {
            System.out.print("猜數字（0 ~ 9）:");
            guess = console.nextInt();
        } while(guess != number);
        
        System.out.println("猜中了...XD");
    }
}
