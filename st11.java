//Input name of a person and count how many vowels it contains. Use String class methods.
public class st11 {
    public static void main(String[] args) {
     String st = "kasak";
     char letter[]=st.toCharArray();
     int count=0;
     for(int i=0;i<letter.length;i++){
        if(letter[i]=='a'||letter[i]=='e'||letter[i]=='i'||letter[i]=='o'||letter[i]=='u'){
         count++;
        }
     }
     System.out.println(count);
     
    }
}
