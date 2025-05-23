package justin.java17.samples.CH04.Array.src.cc.openhome;

public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(var x = 0; x < cords.length; x++) {
            for(var y = 0; y < cords[x].length; y++) {
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }

        System.out.println();

        for(int[] row : cords) {
            for(int value : row) {
                System.out.printf("%2d", value);
            }
            System.out.println();
        }

        int[][] cords2 = new int[2][3];
        for (int[] row : cords2) {
            for (int value : row) {
                System.out.printf("%2d", value);
            }
        }

        System.out.println();

        var cords3 = new int[2][3];
        for (var row : cords3) {
            for (var value : row) {
                System.out.printf("%2d", value);
            }
        }

        var cords4 = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };


    }
} 
