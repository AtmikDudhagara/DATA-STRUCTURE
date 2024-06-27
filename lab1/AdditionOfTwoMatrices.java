import java.util.Scanner;

public class AdditionOfTwoMatrices {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];

        int newarr[][] = new int[2][2];

        // to enter the values of 1st array
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                arr1[i][j]= sc.nextInt();

            }
        }

        // to enter the values of 2nd array

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                arr2[i][j]= sc.nextInt();

            }
        }

        // addition of 2 array

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

               newarr[i][j] = arr1[i][j]+arr2[i][j];

            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                System.out.println(newarr[i][j]);

            }
        }



    }



}
