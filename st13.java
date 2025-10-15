import java.util.Arrays;
public class st13 {
    public static void main(String[] args) {
        String w1="LISTEN";
        String w2="SILENT";
        
        char []arr1 = w1.toCharArray();
        char []arr2 = w2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean status = false;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
               if(arr1[i]!=arr2[i]){
                break;
               }else if(arr1[i]==arr2[i]) status=true;
            }
            //System.out.println(status);
        }
        System.out.println(status);
        
        
    }
}
