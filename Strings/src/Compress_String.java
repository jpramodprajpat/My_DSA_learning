public class Compress_String {
    public static void main(String[] args) {
        String s = "aaaabbbaaacccddeeeef";
        int n = s.length();
        int count = 1 ;
        char ch = s.charAt(0);
        for (int i = 0; i < n-1; i++)
        {
            if(ch == s.charAt(i+1) ) count++;
            else if(ch != s.charAt(i+1))
            {
                System.out.print(ch);
                System.out.print(count);
                ch = s.charAt(i+1); // new character
                count = 1;  // new counting
            }
        }
        System.out.print(ch);
        System.out.print(count);

        // using two pointer solve this
    }
}
