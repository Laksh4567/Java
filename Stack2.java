//Implement stack using Queue
import java.util.queues;
import java.util.LinkedList;
class stack{
  Queue<Integer> Q1=new LinkedList<>();
  Queue<Integer> Q2=new LinkedList<>();
  public void push(int val){
    while(!Q1.isEmpty()){
      Q2.offer(Q2.poll());
    }
    Q1.offer(val);
    while(!Q2.isEmpty()){
      Q1.offer(Q1.poll());
    }
    Q2.offer(val);
  }
  public int peek(){
    if(Q1isEmpty()){
      System.out.println("Stack is empty");
      return -1;
    }
    return Q1.peek();
  }
  public void pop(){
    if(Q1isEmpty()){
      System.out.println("Stack is empty");
      return -1;
    }
    return Q1.poll();
  }
  public static void main(String args[]){
    StackUsingQueue stack=new StackUsingqueue();
    stack.push(val:10);
    stack.peek();
    stack.push(val:20);
    stack.push(val:30);
    stack.push(val:40);
    stack.peek();
    stack.pop();
    stack.peek();
  }
}
