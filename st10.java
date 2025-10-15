//10) WAP to count the word whose first letter is  vowel.
public class st10 {
    public static void main(String[] args) {
      String st = "orange is a fruit or color"; 
      String arr[] = st.split(" ");
      int count=0;
      for(String word: arr){
        //word.toLowerCase();
        if(word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u'){
            count++;
        }
      }
      System.out.println(count);
    }
}
