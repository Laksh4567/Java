//copy the content of stack to another stack in same order(copy stack)
/*import java.util.Stack;
import java.util.*;
public class stack {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Stack<Integer> st=new Stack<>();*/
    /*int n;
    System.out.println("Enter no . of elements");
    n=sc.nextInt();
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
        st.push(x);
    }*/
    /*st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    System.out.println("Stack elements are: "+st);
    // reverse order
    Stack<Integer> st1=new Stack<>();
    while(st.size()>0){
        st1.push(st.pop());
    }
    Stack<Integer> st2=new Stack<>();
    while(st1.size()>0){
        st2.push(st1.pop());
    }
    System.out.println(st2);  
  }
}*/
//Insertion of element in stack
/*import java.util.Stack;
public class stack {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack elements are: "+st);
        int idx=2;
        int x=67;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x); 
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}*/
// reverse the string using recursion
import java.util.Stack;
public class stack {
    public static void pushatBottom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushatBottom(st,x);
        st.push(top);
    }
    public static void reverse(Stack<Integer>st){
        if(st.size()==1){
            return ;
        }
        int top=st.pop();
        reverse(st);
        pushatBottom(st,top);

    }
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}