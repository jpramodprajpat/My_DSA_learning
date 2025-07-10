package String_Builders;
import java.util.*;
public class Toggle_cases {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
//        for (int i = 0; i < sb.length(); i++) {
//            if(sb.charAt(i)<90){ // capital
//                sb.setCharAt(i,(char)((int)(sb.charAt(i) + 32)));
//            }else{ // small
//                sb.setCharAt(i,(char)((int)(sb.charAt(i) - 32)));
//            }
//        }
        for (int i = 0; i < sb.length(); i++)
        {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 65 && ascii <= 90) ascii+=32;
            else if(ascii >= 97 && ascii <=122) ascii-=32;
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
