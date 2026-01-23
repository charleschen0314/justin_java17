package justin.java17.samples.CH11.Thread.src.cc.openhome;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        var clerk = new Clerk(); 
        new Thread(new Producer(clerk)).start(); 
        new Thread(new Consumer(clerk)).start(); 
    }    
}
