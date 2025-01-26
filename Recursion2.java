//Print all permutations of a string.Time[0(n!)] def:- all possible combinations of letters
/*public class Recursion2 {
    public static void Printpermutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            Printpermutation(newstr,permutation+curr);

        }
    }
    public static void main(String[] args) {
        String str="abcd";
        Printpermutation(str,"");
        
    }
}*/
//Count total paths in a maze to move from(0,0)to (n,m)
/*public class Recursion2{
    public static int Uniquepath(int i,int j,int n,int m){
        if(i==n-1 || j==m-1){
            return 1;
        }
        int down=Uniquepath(i+1,j,n,m);
        int right=Uniquepath(i,j+1,n,m);
        return down+right;
    }
    public static void main(String args[]){
        int n=3;
        int m=3;
        int path=Uniquepath(0,0,n,m);
        System.out.println(path);
    }
}*/
//place the size of tile 1*m in the floor of the size n*m.
/*public class Recursion2{
    public static int Floortiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical=Floortiles(n-m,m);
        int horizontal=Floortiles(n-1,m);
        return vertical+horizontal;
    }
    public static void main(String args []){
        int n=4;
        int m=2;
        int path=Floortiles(n,m);
        System.out.println(path);
    }
}*/
//Find the number of ways in which you can invite n number of peopleto your party single or in pair.
/*public class Recursion2{
    public static int guestcall(int n){
        if(n<=1){
            return 1;
        }
        int single= guestcall(n-1);
        int pair= (n-1)*guestcall(n-2);
        return single+pair;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(guestcall(n));
    }
}*/
//print all the subsets of a set of first n natural number.
import java.util.*;
public class Recursion2{
    public static void prinsubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size()-1;i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println( );
    }

    public static void finsubsets(int n,ArrayList<Integer>subset){
        if(n==0){
            prinsubset(subset);
            return;
        }
        //addd hoga 
        subset.add(n);
        finsubsets(n-1,subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        finsubsets(n-1,subset);
    }
    public static void main(String args[]){
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        finsubsets(n,subset);
    }
}