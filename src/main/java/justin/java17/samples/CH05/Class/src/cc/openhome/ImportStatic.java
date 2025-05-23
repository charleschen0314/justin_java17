package justin.java17.samples.CH05.Class.src.cc.openhome;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ImportStatic {
    public static void main(String[] args) {
        var console = new Scanner(in);
        out.print("請輸入姓名：");
        out.printf("%s 你好！%n", console.nextLine());
    }
}
