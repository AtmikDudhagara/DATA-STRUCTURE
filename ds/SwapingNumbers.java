import java.util.Scanner;

public class SwapingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        InnerswapingNumbers(a, b);
    }
    public static void InnerswapingNumbers (int a,int b){
        
      int  temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a+"b="+b);

    }
}
