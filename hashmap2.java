//majority element
//given an integer array of size n find all elementsthat appear more than n/3 times.

/*import java.util.HashMap;

public class hashmap2 {
    public static void majority(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String args[]){
        int nums[]={1,3,2,5,1,3,1,5,1};
        majority(nums);
    }
}*/


//union of 2 array
/*import java.util.HashSet;
public class hashmap2{
    public static int unionofarray(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static void main(String args[]){
        int arr1[]={7,3,9,11};
        int arr2[]={7,3,8,9,2,9,4};
        System.out.println(unionofarray(arr1, arr2));
    }
}*/

//intersection of 2 array
/*import java.util.HashSet;
public class hashmap2{
    public static int intersectionofarray(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                set1.add(arr2[j]);
            }
        }
        return set1.size();
    }
    public static void main(String args[]){
        int arr1[]={7,3,9,11};
        int arr2[]={7,3,8,9,2,9,4};
        System.out.println(intersectionofarray(arr1, arr2));
    }
}*/

//find itenary from tickets
/*import java.util.HashMap;
import java.util.HashSet;
public class hashmap2{
    public static String start(HashMap<String,String> tick){
        HashMap<String,String> revmap=new HashMap<>();
        for(String key:tick.keySet()){
            revmap.put(tick.get(key),key);
        }
        for(String key:tick.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("chennai","Bangaluru");
        tickets.put("mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");

        String start=start(tickets);
        while(tickets.containsKey(start)){
            System.out.println(start);
            start=tickets.get(start);
        }
        System.out.println(start);
    }
}*/

//Subarray sum equal to k

/*import java.util.HashMap;

public class hashmap2{
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);  // We put (0, 1) into the map. This represents the "empty prefix" before the array starts.
        int ans=0;  // This will store our final count of subarrays.
        int sum=0;  // This will store the 'current prefix sum' as we go through the array.
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];  // 1. Update the 'current prefix sum' by adding the current number

            if(map.containsKey(sum-k)){  If we find such a 'prev_sum' in our map, it means there's a subarray
                ans+=map.get(sum-k);
            }

            if(map.containsKey(sum)){  // If we've seen this 'current prefix sum' before, increase its count by 1
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);  // If this is the first time we're seeing this 'current prefix sum', record it with a count of 1
            }
        }
        System.out.println(ans);
    }
}*/
