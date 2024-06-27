import java.util.Random;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0 ; i<=n-1;i++){
            arr[i]=sc.nextLine();
        }
       // int index = rand.nextInt(0,n-1);
       int index=2;
        System.out.println(arr[index]);
        String c = arr[index];
        System.out.println("enter the word");
        String b =sc.nextLine();
        int count= 0;
        for(int i=0 ; i <n-1;i++){
            for(int j=0;j<b.length();j++){
                if(c.charAt(i) == b.charAt(j)){
                    count++;
            }
          
            }
            
        }
        if(count==c.length()){
            System.out.println("entered word is anagram");
        }
        else{
            System.out.println("entered word is not anagram");
        }
    }
}
