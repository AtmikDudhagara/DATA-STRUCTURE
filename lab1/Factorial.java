import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=a-1;i!=0;i--){
        a=a*i;
    }
    System.out.println(a);
  }  

}
