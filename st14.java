// WAP check if a String contains only digits?
public class st14 {
    public static void main(String[] args) {
        String st="111224";
         boolean status=true;
       // char arr[] = st.toCharArray();
        for(int i=0;i<st.length();i++){
        if(st.charAt(i)<'0'||st.charAt(i)>'9'){
            status = false;
        }
        }
        System.out.println(status);
    }
}
