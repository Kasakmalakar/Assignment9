/*5. Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions */
public class st4 {
    public static void main(String[] args) {
     String s1="kasak"; 
     String s2="neha";
     boolean count=false;
     if(s1.length()==s2.length()){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
               // System.out.println("they are lexigraphocally equal ");
              count=true;
            }
        }
     }else count=false;
     if(count==true){
        System.out.println("they are lexigraphocally equal ");
     }else System.out.println("they are not lexigraphocally equal");
    }
}
