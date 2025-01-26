/*public class number {
    public static void main(String[] args) {
        int n=6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }   
    }
}
*/
/*public class number {
    public static void main(String[] args) {
        int n=6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i+1);j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }   
    }
}
*/
/*public class number {
    public static void main(String[] args) {
        int n=6;
        int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }   
    }
}
*/
public class number {
    public static void main(String[] args) {
        int n=6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }   
    }
}