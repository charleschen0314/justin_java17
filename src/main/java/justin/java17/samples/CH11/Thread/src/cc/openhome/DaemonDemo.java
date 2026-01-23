package justin.java17.samples.CH11.Thread.src.cc.openhome;

public class DaemonDemo {

    public static void main(String[] args) {
        var thread = new Thread(() -> {
            while (true) {
                System.out.println("Orz");
            }
        });
//        thread.setDaemon(true);
        thread.start();
    }
}
