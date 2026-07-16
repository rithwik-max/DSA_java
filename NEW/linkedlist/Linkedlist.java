public class Linkedlist{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  static Node head;
    public  static Node tail;
    public static int size;        
    public void addfirst(int data){
        
        //newnode
        Node newnode= new Node(data);
        size++;
        //check single
        if(head == null){
            head = tail = newnode; 
            return;
        }
        //hedd to new
        newnode.next=head;
        //new to hea
        head=newnode;
    }
    public void addlast(int data){
        //newnode
        Node newnode= new Node(data);
                size++;
        //check single
        if(tail == null){
            head = tail = newnode; 
            return;
        }
        //hedd to new
        tail.next=newnode;
        //new to hea
        tail=newnode;
    }
    public void printlinkedlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
         System.out.println(" null ");
    }
    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        //create  node
        Node newnode= new Node(data);
                size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removefirst(){
        if(size == 0){
            return 0;
        }
       else if(size == 1){
            int val= head.data;
            head = tail=null;
            return val; 
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removelast(){
         if(size == 0){
            return 0;
        }
       else if(size == 1){
            int val= head.data;
            head = tail=null;
            return val; 
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }
    public int ltrsearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp =  temp.next;
            i++;
        }
        return -1;
    }
    public void revrse(){
        Node prev=null;
        Node curr= head;
        head=tail;
         Node next ;
        while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        head = prev;
    }
    public void findremove(int n){
        //finding size
        Node temp = head;
        int size=0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head = head.next;
            return;
        }
        int i=0;
        int idx=size-n;
        Node prev= head;
        while(i<idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.printlinkedlist();
        ll.add(2, 9);
        ll.printlinkedlist();
        // ll.revrse();
        // ll.printlinkedlist();
        ll.findremove(9);
        ll.printlinkedlist();

    }
}