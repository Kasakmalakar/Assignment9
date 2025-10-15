/*6. Write a Java program to compare two strings lexicographically , ignoring case differences */
public class st5 {
    public static void main(String[] args) {
       String str1="promise";  
       String str2="PROMISE";
       Boolean status;
       if(str1.length()==str2.length()){
        for(int i=0;i<str1.length();i++){
            if((str1.charAt(i)+32)==str2.charAt(i)){
               status=true;
            }
        }
       }else status=false;
        if(status=true){
            System.out.println("lexicographically equal");
        }else System.out.println("lexicographically not equal");

    }
}
