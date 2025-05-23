package justin.java17.labs.CH07.OceanWorld1.src.cc.openhome;

public class Submarine implements Swimmer {

    private String name;
    
    public Submarine(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void swim() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }
}
