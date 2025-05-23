package justin.java17.exercises.CH09.Exercise.src.cc.openhome;

public class Exercise1 {
    public static void main(String[] args) {
        for(var c : new IterableString("Justin")) {
            System.out.println(c);
        }
        
        new IterableString("Monica").forEach(c -> System.out.println(c));
    }
}
