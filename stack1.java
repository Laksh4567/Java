// Array Implementation of stack.
public class stack1 {
    public class Stack { // Renamed inner class to Stack for clarity
        private int[] arr = new int[6]; // so that it cannot be extracted from other functions.
        private int idx = 0;

        public void push(int data) {
            if (idx < arr.length) { // Check for stack overflow
                arr[idx] = data;
                idx++;
            } else {
                System.out.println("Stack is full");
            }
        }

        public int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        public int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            idx--; // Decrease index first
            return top;
        }

        public void display() {
            for (int i = 0; i < idx; i++) { // Display all elements
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public int size() {
            return idx;
        }
    }

    public static void main(String[] args) {
        stack1 stack1 = new stack1(); // Create an instance of the outer class
        stack1.Stack st = stack1.new Stack(); // Correctly create an instance of the inner class
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.pop();
        st.display();
        System.out.println("Size of stack: " + st.size());
    }
}