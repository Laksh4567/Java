//to get the nth node from the last of the linked list and delete the nth node
/*public class linked {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next==null){
                return null;
            }
            //size
            int size=0;
            ListNode curr=head;
            while(curr!=null){
                curr=curr.next;
                size++;
            }
            // prev node 
            if(n==size){
                return head.next;
            }
            int indextS=size-n;
            ListNode prev=head;
            int i=1;
            while(i<indextS){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return head;
        }
    }  Leetcode solution*/

//check whether the linked list is palindrome or not.
/*class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        if(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    // hare turtle approach
    public ListNode middle(ListNode head){
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        //find middle element
        ListNode middle=middle(head);
        ListNode Secondhalfstart= reverse(middle.next);
        ListNode Firsthalfstart= head;
        while(Secondhalfstart!=null){
            if(Firsthalfstart.val!=Secondhalfstart.val){
                return true;
            }
            Firsthalfstart=Firsthalfstart.next;
            Secondhalfstart=Secondhalfstart.next;
        }
        return true;
    }
}*/

// Linked list cycle
/*public class Solution {
    public boolean hasCycle(ListNode head) {
       
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                fast= fast.next.next;
                slow= slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
    }*/
// Linked list Limitations
// get 0(n)
//if only head is given then we have to traverse the linked list
// more space is used.
// no backward operations are used
