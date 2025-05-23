package justin.java17.samples.CH07.OceanWorld4.src.cc.openhome;

public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.println("飛魚游泳");
    }

    @Override
    public void fly() {
        System.out.println("飛魚會飛");
    } 
}