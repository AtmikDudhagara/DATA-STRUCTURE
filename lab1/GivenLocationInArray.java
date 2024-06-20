import java.util.Scanner;

public class GivenLocationInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }
        System.out.println("enter the index");
        int c=sc.nextInt();
    }
}
