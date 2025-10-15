/*Write a Java program to count a number of Unicode code points in the specified text range of a String */
public class st3 {
    public static void main(String[] args) {
     String str = "kasak malakar";
     int count=0;
     int start=1,end=7;
    //   int count=str.codePointCount(1,8); 
    //    System.out.println(count);
    for(int i=start;i<=end;i++ ){
          count++;
    }
    System.out.println(count);
   
    }
}
