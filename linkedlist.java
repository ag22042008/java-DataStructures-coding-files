//create a single node in memory not to build a linked list



class Node{
    int data;
    Node next;
    public Node(int val){
        this.data=val;// we always use this to refer current variable 
        next=null;
    }
}
class linkedlist1{
    Node head;
    // we will change the address to add new nodes we write in linked list class
    // new node to add it to last
    void addtolast(int val){
        Node curr=head;  // if u lose ur head to linked list lost
     Node newnode=new Node(val);// node created
      //when list is empty
        if(head==null){ //now head will be pointing to it 
            head=newnode;
            head.next=null;
        
            return ;
        }
     // jb tk last node pr na ho head head ko chlate rho 
     // but u are moving ur head but head gives node address of first node so we create a copy of header node
     
     while(curr.next!=null){
        curr=curr.next;
     }
     curr.next=newnode;
    }
   void deletelastnode(){
     if(head==null){
        return ;
     }
     if(head.next==null){
        head=null;
        return;
    }// for one always thinkwhen we are skipping a node
      Node curr=head;
      while(curr.next.next!=null){
        curr=curr.next;
      }
      curr.next=null;
    } 
    void printlinkedlist(){
        
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println("null");

    }
    void addtofront(int val){

    }
    int size(){
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;

        }
        return count;
    }
}

public class linkedlist {
    public static void main(String[] args) {
        linkedlist1 s=new linkedlist1();
        s.addtolast(1);
        s.addtolast(2);
        s.printlinkedlist();
        System.out.println(s.size());
        s.deletelastnode();
        System.out.println(s.size());
      
        
    }
}
