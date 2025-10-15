
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
   

