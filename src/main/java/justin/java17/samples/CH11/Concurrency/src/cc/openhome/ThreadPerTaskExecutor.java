package justin.java17.samples.CH11.Concurrency.src.cc.openhome;

import java.util.concurrent.Executor;

public class ThreadPerTaskExecutor implements Executor {
     public void execute(Runnable r) {
         new Thread(r).start();
     }
}
