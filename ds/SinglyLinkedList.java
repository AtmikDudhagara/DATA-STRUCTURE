import java.util.Scanner;

public class SinglyLinkedList {
   
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        boolean flag=true;
        while (flag) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at position");
            System.out.println("3. Insert in last");
           
            System.out.println();
            System.out.print("Enter a choice: ");
            
            int n = sc.nextInt();
            switch (n) {
                case 1:
                System.out.println("Enter the element you want to insert:");
                int a = sc.nextInt();
                l1.insertAtFirst(a);
                break;

                case 2:
                System.out.println("Enter the element you want to insert:");
                int b = sc.nextInt();
                l1.insertAtlast(b);
                break;

                case 3:
                System.out.println("Enter the element you want to insert:");
                int c = sc.nextInt();
                l1.insertAtOrder(c);
                break;

                case 4:
                l1.displayList();
                break;

                case 5:
                l1.removeFirst();
                break;

                case 6:
                l1.removeLast();
                break;

                case 7:
                System.out.println("Enter the element you want to delete:");
                int d = sc.nextInt();
                l1.deletePosition(d);
                break;
                
                case 8:
                ans = false;
                break;
        }
    }

}
 class LinkedList{
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data=data;
            this.link=null;
        }
        
    
    
    }
    public Node first;
    public void insertAtFirst(int data){
        Node newNode= new Node(data);
        if(first==null){
            first=newNode;
            return;
        }
        Node temp=first;
        first=newNode;
        first.link=temp;

    }
    public void insertAtPosition(int data,int enteredpos){
        Node newNode= new Node(data);
        int count=0;
        
        Node temp=first;
        if(first==null){
            first=newNode;
            return;
        }
        while(count != enteredpos){
                    temp= temp.link;  
                    count++;    
        }
        newNode.link = temp.link;
        temp.link = newNode;
    }
    public void insertAtlast(int data){
        Node newNode= new Node(data);
        if(first==null){
            first= newNode;
        }
        Node lastNode= first;
        while (lastNode.link!=null) {
            lastNode= lastNode.link;

            
        }
        lastNode.link= newNode;

        
    }
    public void insertAtOrder(int data){
        Node newNode = new Node(data);
        if(first==null){
            first= newNode;
        }
        if(first==null || newNode.data <= first.data ){
                newNode.link = first;
                first = newNode;

        }
        Node temp=first;
        while (temp.link!=null && newNode.data >=temp.link.data) {
            temp = temp.link;

        }
        newNode.link=temp.link;
        temp.link= newNode;
    }
    public void removeFirst(){




    }
    public void removeLast( int data){}
    public void deletePosition(int data){}
    void displayList(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.link; 
        }
    }
}}

