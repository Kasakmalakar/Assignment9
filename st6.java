/*7. Write a Java program to concatenate a given string to the end of another string */

import java.util.Arrays;

public class st6 {
    public static void main(String[] args) {
      String s1="hello";
     String s2="world";
     char arr1[] = s1.toCharArray();
     char arr2[] = s2.toCharArray();
     int len1= s1.length();
     int len2= s2.length();
     char result[]=new char[len1+len2];
     for(int i=0;i<len1;i++){
        result[i]=arr1[i];

     }
     for(int i=0;i<len2;i++){
        result[i+len1]=arr2[i];
     }
     String st=Arrays.toString(result);
     System.out.println(st);  
    }
}
