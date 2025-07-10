public class Substring {
    public static void main(String[] args) {
        String str = "abcdefg";
        for (int i = 0; i < str.length() ; i++)
        {
           String s = String.valueOf(str.charAt(i));
            System.out.print(s +" ");
            for (int j = i+1; j < str.length(); j++) {
                s+= String.valueOf(str.charAt(j));
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
