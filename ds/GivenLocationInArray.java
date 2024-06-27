import java.util.Scanner;

public class GivenLocationInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int newArr[]=new int[n+1];
        System.out.println("enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("enter the index");
        int index=sc.nextInt();
        System.out.println("enter the new element");
        int newelement=sc.nextInt();
        //copying old array into new one
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
            
        }
        
        newArr[index]=newelement;

        for(int i=index+1;i<n+1;i++){
            newArr[i]=arr[i-1];
        }
        for(int i=0;i<n+1;i++){
            System.out.println(newArr[i]);
        }
    }
}
