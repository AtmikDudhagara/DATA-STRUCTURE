import java.util.Scanner;
public class Recognize {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        
    }

    public static boolean checkString(String str){
        java.util.Stack<Character> st= new java.util.Stack<Character>();

        int index=0;
        char next=str.charAt(index);
        st.push('c');
        while (next!='c' && str.length()!=0) {
            if(next==' '){
                return false;
            }
            
            st.push(next);
            index++;
            next = str.charAt(index);
        }
        index++;
        while (st.peek()!='c' && next<str.length()) {
            
        }
        return true;
    }
    
}
