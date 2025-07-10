public class Max_digit_InString_Array {
    public static void main(String[] args)
    {
        String[] arr = {"13" , "0023" , "23" , "0000012" ,"10","78" , "00078","1234534343"};
        int n = arr.length;
        String maxst = arr[0];
        for (int i = 0; i < n ; i++) {
            maxst = max(maxst,arr[i]);
        }
        System.out.println(maxst);
    }
    public static String max(String s1 , String s2){
        String str1 = purify(s1) ,str2 = purify(s2);
        if(str1.length() > str2.length()) return s1;
        if(str1.length() < str2.length()) return s2;
        // for 00023 and 23 or 234 an 123 -> same length strings digits comparisn
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i))
            {
                if(str1.charAt(i) > str2.charAt(i)) return s1;
                else  return s2;
            }
        }
        if(s1.length() > s2.length()) return s1;
        else return s2;
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') return s.substring(i);
        }
        return "0";
    }
}
