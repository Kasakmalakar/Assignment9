<<<<<<< HEAD
// WAP check if a String contains only digits?
public class st14 {
    public static void main(String[] args) {
        String st="111224";
         boolean status=true;
       // char arr[] = st.toCharArray();
        for(int i=0;i<st.length();i++){
        if(st.charAt(i)<'0'||st.charAt(i)>'9'){
            status = false;
        }
        }
        System.out.println(status);
=======
// Write a Java program to get the canonical representation of the string object
public class st14 {
    public static void main(String[] args) {
      String s1 = new String("hello");
      String s2 = new String("hello");
      System.out.println(s1==s2);
      System.out.println(s1.intern()==s2.intern());  
>>>>>>> 2924c7eacb406b259dcd053a0ae1c5d4c744d73e
    }
}
