package justin.java17.samples.CH07.OceanWorld3.src.cc.openhome;

public abstract class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public abstract void swim();
}
