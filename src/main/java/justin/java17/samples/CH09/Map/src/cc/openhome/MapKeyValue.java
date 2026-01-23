package justin.java17.samples.CH09.Map.src.cc.openhome;

import java.util.*;
import static java.lang.System.out;

public class MapKeyValue {
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        
        out.println("顯示鍵");
        // keySet()傳回Set
        map.keySet().forEach(key -> out.println(key));
        
        out.println("顯示值");
        // values()傳回Collection
        map.values().forEach(key -> out.println(key));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+"====>"+value);
        }
        System.out.println("===========");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"===>"+entry.getValue());
        }
    }
}
