
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

