package justin.java17.exercises.CH08.Exercise3.src.cc.openhome.virtual;

public class InsufficientException extends Exception {
    private int remain;
    
    public InsufficientException(String message, int remain) {
        super(message);
        this.remain = remain;
    }
    
    public int getRemain() {
        return remain;
    }
}
