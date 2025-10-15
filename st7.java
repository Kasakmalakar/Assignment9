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
