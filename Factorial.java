import java.util.*;

public class Factorial {
    public static void calcfactorial(int a){
        int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        calcfactorial(a);
    }   
}
