import java.util.Scanner;

public class SomethingIN18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the value of array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        //number to search in array
        System.out.println("enter the number that you want to search in array");
        int b= sc.nextInt();
        //number to replace in array
        System.out.println("enter the number you want to replace");
        int c=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==b){
                System.out.println("index of number"+i);
                a[i]=c;
            }
        }
        System.out.println("new array:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
