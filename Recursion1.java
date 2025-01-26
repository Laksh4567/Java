/*public class Recursion1 {
    public static void ReverseString(String str,int index){
        if(index==0){
            return;
        }
        System.out.println(str.charAt(index));
        ReverseString(str,index-1);
    }
    public static void main(String args[]){
        String str="Lakshnanda";
        ReverseString(str,str.length()-1);
    }
}*/
//Find first and last occurence of word in a string
/*public class Recursion1{
    public static int First=-1;
    public static int Last=-1;
    public static void StringFist(String str,int index,char element){
        if(index==str.length()){
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char curr=str.charAt(index);
        if(curr==element){
            if(First==-1){
                First=index;
            }else{
                Last=index;
            }
        }
        StringFist(str,index+1,element);
    }
    public static void main(String[] args) {
        String str="aabanpcealmrhk";
        StringFist(str,0,'a');
    }

}*/
//Check whether the given array is Strictly increasing sorted or not time[0(n)]
/*public class Recursion1{
    public static boolean Sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            return false;
        }
        return Sorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,5};
        System.out.println(Sorted(arr,0));
    }
}*/
//Move all "x" to the end of the string. Time[0(n+count)]
/*public class Recursion1{
    public static void MoveX(String str,int index,int count,String str1){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                str1+='x';
            }
            System.out.println(str1);
            return;
        }
        char curr=str.charAt(index);
        if(curr=='x'){
            count++;
            MoveX(str,index+1,count,str1);
        }else{
            str1+=curr;// new string=newstring+curr
            MoveX(str, index+1, count, str1);
        }
    } 
    public static void main(String[] args) {
        String str= "abxcxxdxp";
        MoveX(str,0,0," ");
        
    }
}*/
//Remove Duplicates to the string Time[0(n)]
/*public class Recursion1{
    public static boolean[]map=new boolean[26];
    public static void RemoveDuplicate(String str,int index,String str1){
        if(index==str.length()){
            System.out.println(str1);
            return;
        }
        char curr=str.charAt(index);
        if(map[curr -'a']==true){
            RemoveDuplicate(str,index+1,str1);
        }else{
            str1+=curr;
            map[curr - 'a']=true;
            RemoveDuplicate(str,index+1,str1);
        }
    } 
    public static void main(String args[]){
        String str="abbaabccdefnffg";
        RemoveDuplicate(str,0,"");

    }
}*/
//Print all the substring of the string [Important].Time[0(2^n)]  Substring def:-it defimnes as the concept that if there is the string so eith the use of the character we can make the new string but the order of the characters of the strings same as that of the substrings.
/*public class Recursion1{
    public static void Substring(String str,int index,String str1){
        if(index==str.length()){
            System.out.println(str1);
            return;
        }
        char curr=str.charAt(index);
        // to be
        Substring(str,index+1,str1+curr);
        //not to be
        Substring(str,index+1,str1);
    }
    public static void main(String args[]){
        String str="aaaa";
        Substring(str,0," ");
    }
}*/
// print all the unique aubsequence of the string.Time[0()].
/*import java.util.HashSet;
public class Recursion1{
    public static void Substring(String str,int index,String str1,HashSet<String> Set){
        if(index==str.length()){
            if(Set.contains(str1)){
                return;
            }else{
                System.out.println(str1);
                Set.add(str1);
                return;
            }
        }
        char curr=str.charAt(index);
        // to be
        Substring(str,index+1,str1+curr,Set);
        //not to be
        Substring(str,index+1,str1,Set);
    }
    public static void main(String args[]){
        String str="aaaa";
        HashSet<String> Set= new HashSet<>();
        Substring(str,0," ",Set);
    }
}*/
//Print keypad combination time[0(4^n)]
/*public class Recursion1{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void printCombination(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char curr=str.charAt(index);
        String mapping=keypad[curr-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        printCombination(str,0,"");
        
    }
}*/