import java.util.Scanner;

class Student_Details {
    int enrollementNo;
    String name;
    int sem;
    double cpi;
    Scanner sc = new Scanner(System.in);

    void getdetails(){
        System.out.println("Enter Details");
        enrollementNo = sc.nextInt();
        name = sc.next();
        sem = sc.nextInt();
        cpi = sc.nextDouble();
    }

    void printdetails() {
        System.out.println(enrollementNo);
        System.out.println(name);
        System.out.println(sem);
        System.out.println(cpi);
    }
}

public class Students {
    public static void main(String[] args) {

        Student_Details[] s = new Student_Details[5];
       
        for (int i=0;i<5;i++) {
           s[i] = new Student_Details();
            s[i].getdetails();
        }
        for (int i=0;i<5;i++) {
            s[i].printdetails();
        }


        
    }
    
}