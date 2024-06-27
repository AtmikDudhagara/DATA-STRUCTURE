import java.util.Scanner;
public class InverseOFGivenOne {



    
    public static void main(String[] args) {
        int a[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array of element: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array before deletation: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("enter position that you want to delete: ");
        int pos = sc.nextInt();
        for (int i = pos; i < size; i++) {
            a[i] = a[i + 1];
        }
        size--;
        System.out.print("array after deletation: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + ",");
        }
    }
}



