
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
    }
}
