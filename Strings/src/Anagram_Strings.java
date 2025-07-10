import java.util.Arrays;

public class Anagram_Strings {
    public static boolean IsAnagram(String s , String t){
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < s.length() ; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsAnagram("anagram","nageram"));
    }
}
