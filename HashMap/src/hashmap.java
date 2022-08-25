import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> set = new HashMap<>();
        System.out.println(set.size());
        set.put("abc",1);
        set.put("cba",2);
        set.put("___",3);
        if(set.containsKey("abc")){
            int val =  set.get("abc");
            System.out.println(val +" ");
            System.out.println("contains abc");
        }
        Set<String> setvales = set.keySet();
        for(String a : setvales){
            System.out.println(a);
        }
    }
}
