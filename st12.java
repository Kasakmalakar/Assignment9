<<<<<<< HEAD

public class st12 {
    public static void main(String[] args) {
       String input="67 89 23 67 12 55 66";
       String []arr = input.split(" ");
       int sum=0;
       for(int i=0; i<arr.length;i++){
        int []arr1 = new int[arr.length] ;
        arr1[i]=Integer.parseInt(arr[i]);
        sum = sum+arr1[i];
       } 
       System.out.println(sum);
=======
// Write a Java program to check whether two String objects contain the same data
public class st12 {
    public static void main(String[] args) {
      String st1="actually"; 
      String st2="actually";
      int flag=1;
      if(st1.length()==st2.length()){
          for(int i=0;i<st1.length();i++){
            if(st1.charAt(i)==st2.charAt(i)){
               flag=0;
            }
          }
      }
      //System.out.println(flag);
      if(flag==0){
        System.out.println(true);
      }else System.out.println(false);
>>>>>>> 2924c7eacb406b259dcd053a0ae1c5d4c744d73e
    }
}
