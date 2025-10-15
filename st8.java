//11. Write a Java program to check whether a given string ends with the contents of another string
public class st8 {
    public static void main(String[] args) {
      String s1="programming";
      String s2="gramming";
      boolean status=false;
      for(int i=(s1.length()-s2.length());i<s1.length();i++){
         for(int j=0;j<s2.length();j++){
             if(s1.charAt(i)==s2.charAt(j)){
                status=true;
             }
         }
         if(status){
            break;
         }
      }  
      System.out.println(status);
    }
}
