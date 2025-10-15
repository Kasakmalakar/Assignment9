<<<<<<< HEAD
import java.util.Arrays;
public class st13 {
    public static void main(String[] args) {
        String w1="LISTEN";
        String w2="SILENT";
        
        char []arr1 = w1.toCharArray();
        char []arr2 = w2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean status = false;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
               if(arr1[i]!=arr2[i]){
                break;
               }else if(arr1[i]==arr2[i]) status=true;
            }
            //System.out.println(status);
        }
        System.out.println(status);
        
        
=======
// Write a Java program to get the contents of a given string as a byte array

import java.nio.charset.StandardCharsets;

public class st13 {
    public static void main(String[] args) {
    String st="smile";
    byte [] b= st.getBytes(StandardCharsets.UTF_8);
    for(byte b1 : b){
        System.out.print(b1+" ");
    }
    //char []arr = st.toCharArray();
    // byte []arr2 = new byte[arr.length];
    // for(int i=0;i<arr.length;i++){
    //     arr2[i]=Byte.parseByte(arr[i]);
    // }
    // for(int i=0;i<arr2.length;i++){
    //     System.out.println(arr2[i]);
    // }
>>>>>>> 2924c7eacb406b259dcd053a0ae1c5d4c744d73e
    }
}
