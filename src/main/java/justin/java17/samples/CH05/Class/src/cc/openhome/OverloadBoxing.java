package justin.java17.samples.CH05.Class.src.cc.openhome;

class Some {
    void someMethod(int i) {
        System.out.println("int 版本被呼叫");
    }
    
    void someMethod(Integer integer) {
        System.out.println("Integer 版本被呼叫");
    }
}

public class OverloadBoxing {
    public static void main(String[] args) {
        var s = new Some();
        s.someMethod(1);

        var s1 = new Some();
        s1.someMethod(Integer.valueOf(1));
    }
}
