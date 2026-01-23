package justin.java17.samples.CH09.Collection.src.cc.openhome;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        var names = Arrays.asList("Justin", "Monica", "Irene");
        forEach(names);
        forEach(new HashSet(names)); 
        forEach(new ArrayDeque(names));

        System.out.println("==");
        names.forEach(name -> System.out.println(name));
        new HashSet(names).forEach(name -> System.out.println(name));
        new ArrayDeque(names).forEach(name -> System.out.println(name));

        System.out.println("==");
        names.forEach(System.out::println);
        new HashSet(names).forEach(System.out::println);
        new ArrayDeque(names).forEach(System.out::println);
    }

    static void forEach(Iterable iterable) {
        for(var obj : iterable) {
            System.out.println(obj);
        }
    }
}