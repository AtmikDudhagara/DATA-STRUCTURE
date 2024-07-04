import java.util.Scanner;

class Stack {
    int top;
    int max;
    int s[];

    public Stack(int size){
        max = size;
        s = new int[max];
        top = -1;


    }

    public void push(int x) {

        if (top >= max - 1) {
            System.out.println("stack overflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return;
        }
        s[++top] = x;

    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
            return -1;
        }
        top--;
        return s[top + 1];
    }

}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);
        System.out.println();
       

       

        while (true) {
            System.out.println();
            System.out.println("1. PUSH");
            System.out.println("2. POP");
           
            System.out.println();
            System.out.print("Enter a choice: ");
            
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a value to Push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    stack.pop();
                    break;
         

                case 6:
                    System.out.println("Exited sucessfully.......");
                    sc.close();
                    return;

                default :
                    System.out.println("Invalid choice!! try again!!");
                    
            }

        }

    }
}
