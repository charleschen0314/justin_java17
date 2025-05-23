package justin.java17.samples.CH08.TryCatch.src.cc.openhome;

public class StackTraceDemo {
  public static void main(String[] args) {
    try {
      c();
    } catch (NullPointerException ex) {
      ex.printStackTrace();
    }
  }

  static void c() {
    b();
  }

  static void b() {
    a();
  }

  static String a() {
    String text = null;
    return text.toUpperCase();
  }
}
