
public class st9 {
    public static void main(String[] args) {
      String st="Dear Student ,you have need to work hard";
      String []words = st.split(" ");
      int max=0;
      String result="";
        for(String word:words){
            
            for(int j=0;j<word.length();j++){
               if(max<word.length()){
                max =word.length();
                result = word;
               }
            }
           
        }
        System.out.println(result);
    }
}
