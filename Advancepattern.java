//Butterfly Pattern
/*public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//Solid Rhombus
/*public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//pyramid pattern1
/*public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}*/
//pyramid pattern2
/*public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}*/
//Palindrome pattern
/*public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/
//Diamaond pattern
/*public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/
// Diamond pattern with prime number
public class Advancepattern {
    public static void main(String[] args) {
        int n=6;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(num+ " ");;
                num++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}