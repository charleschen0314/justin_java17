package justin.java17.samples.CH06.Game6.src.cc.openhome;

public class Magician extends Role {
    @Override
    public void fight() {
        System.out.println("魔法攻擊");
    }
    
    public void cure() {
        System.out.println("魔法治療");
    }
    
    @Override
    public String toString() {
        return "魔法師 " + super.toString();
    }
}
