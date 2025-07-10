package hashMap;
import java.util.HashMap;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Pramod" , 20);
        map.put("Priya" , 18);
        map.put("jayesh" , 10);
        map.put("mehek" , 10);
        map.put("mohit" , 1);
        // for-each
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.print(key +" : "+ val+" ");
        }
        // not such useful
        System.out.println();
        for(int val : map.values()){
            System.out.print(val +" ");
        }
        System.out.println();
        for( Object pair : map.entrySet()){
            System.out.print(pair +" ");
        }
    }
}
