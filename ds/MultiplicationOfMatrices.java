import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar1[][] = new int[3][2];
        int ar2[][] = new int[2][3];

          // to enter the values of 1st array
          System.out.println("enter the value of array 1");
          for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){

                ar1[i][j]= sc.nextInt();

            }
        }
        System.out.println("enter the value of array 2");

          // to enter the values of 2nd array
          for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){

                ar2[i][j]= sc.nextInt();

            }
        }
        int newarr[][]= new int[3][3];
         for(int i =0;i<3;i++){
            for(int j = 0 ;j<3;j++)
            for(int k =0;k<2;k++){
                newarr[i][j]+=ar1[i][k]*ar2[k][j]   ;         }
         }

  // to print the values of new array
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){

        System.out.println(newarr[i][j]);

    }
}

    }
}
