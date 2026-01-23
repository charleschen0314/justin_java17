package justin.java17.exercises.CH10.Exercise.src.cc.openhome;

import java.util.Scanner;
import static justin.java17.exercises.CH10.Exercise.src.cc.openhome.FileUtil.open;

public class Exercise3 {
    public static void main(String[] args) {
        open(args[0], fileInputStream -> {
            var file = new Scanner(fileInputStream);
            while(file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        });
    }
}
