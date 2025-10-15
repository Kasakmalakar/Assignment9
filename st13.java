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
    }
}
