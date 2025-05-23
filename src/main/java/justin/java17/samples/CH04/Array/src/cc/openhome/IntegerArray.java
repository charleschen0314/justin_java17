package justin.java17.samples.CH04.Array.src.cc.openhome;

public class IntegerArray {
    public static void main(String[] args) {

        Integer[] scores = new Integer[3];

        for(Integer score : scores) {
            System.out.printf("%2d ", score);
        }

        System.out.println();
        
        scores[0] = 99;
        scores[1] = 87;
        scores[2] = 66;
        
        for(Integer score : scores) {
            System.out.printf("%2d ", score);
        }
    }
}
