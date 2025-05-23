package justin.java17.samples.CH04.String.src.cc.openhome;

public class OneTo100 {
    public static void main(String[] args) {
        var oneTo100 = new StringBuilder();
        for (var i = 1; i < 100; i++) {
            oneTo100.append(i).append('+');
        }
        System.out.println(oneTo100.append(100).toString());

        System.out.println("\uD834\uDD1E".charAt(0));
        System.out.println("\uD834\uDD1E".codePoints().count());
        System.out.println(Character.toChars(0X6796));
    }
}
