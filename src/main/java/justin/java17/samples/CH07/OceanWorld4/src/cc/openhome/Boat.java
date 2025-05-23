package justin.java17.samples.CH07.OceanWorld4.src.cc.openhome;

public class Boat implements Swimmer {
    protected String name;
    
    public Boat(String name) {
        this.name = name;
    }
    
    @Override
    public void swim() {
        System.out.printf("船在水面 %s 航行%n", name);
    }
} 
