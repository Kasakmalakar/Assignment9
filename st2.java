/*2. Write a Java program to get the character at the given index within the String */
public class st2 {
    public static void main(String[] args) {
       String name="KASAK";
       int length=name.length();
       char []arr=name.toCharArray(); 
       int index=2;
       for(int i=0;i<length;i++){
        if(i==index){
            System.out.println(arr[i]);
        }
       }
    }
}
