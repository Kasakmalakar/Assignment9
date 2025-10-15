<<<<<<< HEAD

public class st7 {
    public static void main(String[] args) {
      String st="aabbccddd";
      char []arr = st.toCharArray();
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==arr[i]){
                arr[j]='\0';
            }
        }
        System.out.print(arr[i]);
      }
      }
    }

=======
/* Write a Java program to test if a given string contains the specified sequence of char values */
public class st7 {
    public static void main(String[] args) {
     String st1="photography";
     String st2="photo";
      boolean status=true;
     int n=st1.length();
     int m = st2.length();
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(st2.charAt(j)!=st1.charAt(i+j)){
                status=false;
                break;
            }
        }
        if(status){
           // System.out.println(status);
            break;
        }
     }
      System.out.println(status);
    
   

    }
}
>>>>>>> 2924c7eacb406b259dcd053a0ae1c5d4c744d73e
