import java.util.Scanner;
public class InverseOFGivenOne2 {



    
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
        System.out.println("enter number that you want to delete: ");
        int number = sc.nextInt();
        int pos=0;
        for(int i=0;i<size;i++){
            if(a[i] == number){
                pos=i;
               
                break;
            }
        }
        for (int i=pos; i < size; i++) {
            a[i] = a[i + 1];
        }
        size--;
        System.out.print("array after deletation: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + ",");
        }
    }
}



