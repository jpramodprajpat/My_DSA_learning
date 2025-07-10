import java.util.Arrays;

public class Sorted_String {
    public static void main(String[] args) {
        String s = "pramod";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
    }
}
