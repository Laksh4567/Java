// Variable size
// Non contiguous memory
//Insert in 0(1)
//Search in 0(n)  chain form as well as linked list as data -> next -> node
// A) singular linked list  B) doubly linked list  C) circular linked list
/*class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add- first ya last;
    //first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //last add
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
        
    }
    //deleteFirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}*/


// how to reverse the linked list.
class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add- first ya last;
    //first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //last add
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
        
    }
    //deleteFirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    //reverse the linked list
    public void reverseInteger(){
        if(head ==null || head.next==null){
            return;
        }
        Node prevNode= head;
        Node currNode=head.next;;
        while(currNode !=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            
            prevNode = currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    // recursive approach
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public static void main(String args[]){
        LL list=new LL();
         list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        // list.printList();

        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}