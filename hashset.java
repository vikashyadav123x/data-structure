import java.util.*;

public class hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        // search
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contains");
        }
        //size of set
        System.out.println(set.size());
        //print all element present in set
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
