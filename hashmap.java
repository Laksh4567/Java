import java.util.*;
public class hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        // insertion
        map.put("india",120);
        map.put("china",45);
        map.put("america",50);

        System.out.println(map);

        //search
        // if(map.containsKey("india")){
        //     System.out.println("key is present in the map");
        // }else{
        //     System.out.println("key is not present in the map");
        // }


        // System.out.println(map.get("china"));
        // System.out.println(map.get("pok"));

        // int arr[]={12,15,18};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val:arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        //for(int val:arr)
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}