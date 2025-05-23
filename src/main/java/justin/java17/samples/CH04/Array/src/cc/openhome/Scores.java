package justin.java17.samples.CH04.Array.src.cc.openhome;

import java.util.Arrays;

public class Scores {
    public static void main(String[] args) {
        int[] scores = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};

        for(var i = 0; i < scores.length; i++) {
            System.out.printf("學生分數：%d ", scores[i]);
        }

        System.out.println();

        Arrays.sort(scores);

        for(int score :  scores) {
            System.out.printf("學生分數：%d ", score);
        }
    }
}
