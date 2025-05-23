package justin.java17.samples.CH06.Game5.src.cc.openhome;

public class SwordsMan extends Role {
    @Override
    public void fight() {
        System.out.println("揮劍攻擊");
    }
    
    public String toString() {
        return "劍士 (%s, %d, %d)".formatted(
            this.name, this.level, this.blood);
    }

}
