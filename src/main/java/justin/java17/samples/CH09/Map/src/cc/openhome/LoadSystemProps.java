package justin.java17.samples.CH09.Map.src.cc.openhome;

public class LoadSystemProps {
    public static void main(String[] args) {
        var props = System.getProperties();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
