//in doubly liked list we can use insertion deletion more efficient
// 1st Type
// can we create a doubly linked list using one pointer with every node
// answer:- yes possible by storing XOR of addresses of previous and next node 
/*public class doublylinked {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    } 
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayrandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp=temp.prev;
        }//now temp is at head
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node b =new Node(4);
        Node a =new Node(10);
        Node c =new Node(2);
        Node d =new Node(99);
        Node e =new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        //display(a);
        //displayrev(e);
        displayrandom(c);
    }
    
}*/
//Insertion in doublylinked list
public class doublylinked{
    static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayrandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp=temp.prev;
        }//now temp is at head
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertbeg(Node head){
        Node t=new Node(40);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    // WHEN ONLY HEAD IS GIVEN NOT THE TAIL
    public static Node insertend(Node tail){
        Node t=new Node(34);
        tail.next=t;
        t.prev=tail;
        tail=t;
        return tail;
    }
    public static void insertAtidx(Node head,int idx,int x){
        Node s=head;
        for(int i=1;i<idx-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
        
    }
    public static void main(String[] args) {
        Node b =new Node(10);
        Node a =new Node(1);
        Node c =new Node(22);
        Node d =new Node(5);
        Node e =new Node(39);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        //Node newhead=insertbeg(a);
        //display(newhead);
        //Node newhead1=insertend(e);
        //display(a);
        insertAtidx(a,76,4);
        display(a);
    }
}