

public class linkedLists{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public int removefirst(){
      if(size==0){
        return 0;
      }
      else if(size == 1){
        int val = head.data;
        head=tail=null;
        return val;
      }
      int val = head.data;
      head = head.next;
      size--;
      return val;
    }
    public int  removelast(){
        if(size == 0){
            return 0;
        }
        else if(size == 1){
            int  val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        size--;
        return val;
    }
    public  void printlinkedlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(" null ");

    }
    public int itrsearch(int node){
       Node temp = head;
       int i=0;
       while(temp !=  null){
        if(temp.data==node){
            return i;
        }
        temp= temp.next;
        i++;
       } 
       return -1;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        head = tail;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        linkedLists ll =  new linkedLists();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.printlinkedlist();
        ll.addlast(5);
        ll.printlinkedlist();
        ll.removefirst();
        ll.printlinkedlist();
        ll.removelast();
        ll.printlinkedlist();
        
    }
}