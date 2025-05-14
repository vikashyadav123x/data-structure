import java.util.*;
public class Hashing {
    public static void main(String[] args){
        // creating hashmap
        HashMap<String, Integer> map = new HashMap<>();
        //insertion in hashmap
        map.put("India", 120);
        map.put("US",30);
        map.put("China", 150);
        System.out.println(map);
        //to access value in hashmap

        //System.out.println(map.get("India"));
        /*if(map.containsKey("India")){
            System.out.println("the key is present ");
        }else{
            System.out.println("the key is not present");
        }*/
        //map.remove("China");
        //System.out.println(map);

        for( Map.Entry<String, Integer> e :map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }
    }
}
