import java.util.*;
import java.io.*;
// tc->0(n)
//sc->0(n)
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class singlyllinreverse {
    public static Node  reverse(Node curr){
        Node prev=null;
        Node curr2=head;
        Node next;
        while(curr!=null){
           next=curr2.next; // to store the next node as to gain refrence after reversal 
           curr2.next=prev;// reversing the link ntw two nodes
           prev=curr;
           curr=next;
        }
        return prev;

    }
    public static printlinklist(Node head){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
        }
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        Node head2=reverse(list.head);
        printLinkedList(head2);

        System.out.println(" ");
    }
}