<<<<<<< HEAD
/*5) Write a java program to reverse each word of String.
	Sample Input: Java Is Plateform Independent
	Output: avaJ sI mrofetalP tnednepednI */
public class st5 {
   
    public static void main(String args[]){
        String str="java is platform independent";
        //split and convert to array
      String  words[] = str.split(" ");
      String result="";
      //loop for fetching each word 
      {for(String word : words){
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
        
         rev+= word.charAt(i);
        }
        result +=rev+" ";
      }
      System.out.println("Original string : "+str);
      System.out.println("result string : " +result);

    }
}
}
    //   String s1 = ("Java Is Plateform Indepedent"); 
    //   String words[] = s1.split(" ");
    //    String result=" ";
    //    for(String word:words){
    //     String rev="";
    //     for(int i=word.length()-1;i>=0;i--){
    //         rev = rev +word.charAt(i);
    //     }
    //     result = result+rev+" ";
    //    }
    //    System.out.println("original string" +s1);
    //    System.out.println("reverse string" +result.trim());
    

=======
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
>>>>>>> 2924c7eacb406b259dcd053a0ae1c5d4c744d73e
