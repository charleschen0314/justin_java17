package justin.java17.labs.CH06.Game6.src.cc.openhome;

public class Magician extends Role {
    public void fight() {
        System.out.println("魔法攻擊");
    }
    
    public void cure() {
        System.out.println("魔法治療");
    }
    
    public String toString() {
        return "魔法師 (%s, %d, %d)".formatted(
            this.name, this.level, this.blood);
    }
}
