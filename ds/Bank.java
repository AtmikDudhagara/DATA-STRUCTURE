import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("type what you want to do");
        String b = sc.next();
        Bank_Details a = new Bank_Details();
        if(b.equals("withdraw")){
            a.withdraw();
        } else if(b.equals("deposit")){
            a.deposit();
        }else if (b.equals("balance")) {
           a.checkbalance();  
        } 
        
    }
}

class Bank_Details{
    Scanner sc= new Scanner(System.in);
    int actno;
    double balance;
    String name;
    void deposit(){
        System.out.println("enter the amount you want to deposit");
        int deposit = sc.nextInt();
        balance = balance+deposit;
    }
    void withdraw(){
        System.out.println("enter the amount you want to deposit");
        int withdraw = sc.nextInt();
        balance = balance-withdraw;
    }
    void checkbalance(){
        System.out.println(balance);
    }
}