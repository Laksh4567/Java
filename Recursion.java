//Print the number from higher order to lower order
/*public class Recursion {
    public static void printnum(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printnum(n);
    }
}*/
//Vice-versa
/*public class Recursion {
    public static void printnum(int n) {
        if(n<10){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printnum(n);
    }
}*/
//Print the sum of first natural number
/*public class Recursion {
    public static void printSum(int i,int n,int sum) {
        if(n==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
        
    }
    public static void main(String[] args) {
        int n=1;
        printSum(1,10,0);
    }
}*/
//Fibonacci Series
/*public class Recursion {
    public static void printFib(int a,int b,int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b,c,n-1);        
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=13;
        printFib(a,b,n-2);
    }
}*/
//Stack Height
/*public class Recursion {
    public static int calcPower(int x, int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 0;
        }
        int xpownm1=calcPower(x,n-1);
        int xpown=x*xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}*/
//Stack height(log n)
public class Recursion {
    public static int calcPower(int x, int n) {
        if(n==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }else{
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }
        
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}