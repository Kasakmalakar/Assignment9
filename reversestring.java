public class reversestring {
    public static void main(String[] args) {
      String str = "java is very simple";
      String arr[]=str.split(" ");
       String result ="";
      for(int i=0;i<arr.length;i++)
      { String rev ="";
        for(int j=arr[i].length()-1;j>=0;j--){
            rev = rev+arr[i].charAt(j);
        }
        result=result+rev+" ";
      }
     System.out.println(result);
    }
}
