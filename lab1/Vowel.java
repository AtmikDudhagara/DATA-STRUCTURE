import java.util.*;;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      char ch = sc.next().charAt(0);
        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("entered character is vowel");
        }
        else{
         System.out.println("entered character is consonent");   
        }

    }
    
}
