package justin.java17.samples.CH05.Class.src.cc.openhome;

public class MathTool {
    public static int sum(int... numbers) {
        var sum = 0;
        for(var number : numbers) {
            sum += number;
        }
        return sum;
    }
}