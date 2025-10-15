// Write a Java program to get the canonical representation of the string object
public class st14 {
    public static void main(String[] args) {
      String s1 = new String("hello");
      String s2 = new String("hello");
      System.out.println(s1==s2);
      System.out.println(s1.intern()==s2.intern());  
    }
}
