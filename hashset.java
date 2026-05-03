//important dsa part because of the time complexity
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        //creation of the hashset
        HashSet<Integer> set=new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(3);
        //Search -contain
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set does not contain");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }
        System.out.println(set);
        //Iterator
        Iterator it =set.iterator();
        //two functions hashNext,next;
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
