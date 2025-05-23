package justin.java17.samples.CH09.Collection.src.cc.openhome;

import java.util.*;

record Student3(String name, String number) {}

public class Students3 {
  public static void main(String[] args) {
    var students = new HashSet();
    students.add(new Student3("Justin", "B835031"));
    students.add(new Student3("Monica", "B835032"));
    students.add(new Student3("Justin", "B835031"));
    System.out.println(students);
  }
}
