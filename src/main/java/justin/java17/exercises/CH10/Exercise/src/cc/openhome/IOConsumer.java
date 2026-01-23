package justin.java17.exercises.CH10.Exercise.src.cc.openhome;

import java.io.IOException;

public interface IOConsumer<T> {
    void accept(T t) throws IOException;
}
