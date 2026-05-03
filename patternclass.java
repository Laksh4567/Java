// left pyramid
/*public class patternclass {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

// right pyramid
/*public class patternclass{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// inverse left pyramid
/*public class patternclass {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
} */

//inverse right pyramid
/*public class patternclass{
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// joining the left and right pyramid

/*public class patternclass{
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
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
}*/

// butterfly pattern
/*public class patternclass{
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
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
}*/

// print H letter
/*public class patternclass {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n  || i==(n/2)+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/


// to print O
/*public class patternclass {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n  || i==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

// to print X.
public class patternclass {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || (i+j==n+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}