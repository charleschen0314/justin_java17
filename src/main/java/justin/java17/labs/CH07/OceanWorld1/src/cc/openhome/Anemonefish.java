package justin.java17.labs.CH07.OceanWorld1.src.cc.openhome;

public class Anemonefish extends Fish {
   public Anemonefish(String name) {
       super(name);
   }
   
    @Override
    public void swim() {
        System.out.printf("小丑魚 %s 游泳%n", name);
    }
}
