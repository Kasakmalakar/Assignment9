<<<<<<< HEAD

public class st8 {
    public static void main(String[] args) {
       String st = "aabbccddd";
       char arr[]=st.toCharArray();
         boolean []isvisited = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
         if(isvisited[i]==true)
               continue;
               int count=1;
         for(int j=i+1;j<arr.length;j++){
            
            if(arr[i]==arr[j]){
             count++;
             isvisited[j]=true;
            }
           
         }
         System.out.println(arr[i]+":"+count);
        }
       } 
    }
   

=======
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
>>>>>>> 2924c7eacb406b259dcd053a0ae1c5d4c744d73e
