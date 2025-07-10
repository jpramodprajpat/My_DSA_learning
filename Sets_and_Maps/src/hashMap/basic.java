package hashMap;
import java.util.HashMap;
public class basic {
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Pramod" , 20);
        map.put("Priya" , 18);
        map.put("jayesh" , 10);
        map.put("mohit" , 1);
//        System.out.println(map.size());
//        //System.out.println(map.clone());
//        System.out.println(map);
//        map.remove("mohit");
//        System.out.println(map.containsKey("Priya"));
//        // both work samely
//        System.out.println(map.entrySet());
//        System.out.println(map);
//        //
//       map.clear();
//        System.out.println(map);
        System.out.println(map.get("raj"));
        System.out.println(map.putIfAbsent("jayesh",12));
    }
}
