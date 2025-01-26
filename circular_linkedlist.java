// critical point maxima and minima 
public class circular_linkedlist {
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
    public void Node mamidistance()
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(5);
        Node d =new Node(3);
        Node e =new Node(2);
        Node f =new Node(7);
        Node g =new Node(8);
        Node h =new Node(9);
        Node i =new Node(1);
        Node j =new Node(10);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        ­i.next=j;
        j.prev=i;
        j.next=null;

    }
}
 