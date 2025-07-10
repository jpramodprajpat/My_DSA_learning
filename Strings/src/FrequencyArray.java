import java.util.Scanner;
public class FrequencyArray
{
    // note : this work for smaller case/ lowercase string only- but but "Pramod hai na"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase(); //oh bhai bhai
        System.out.println(str);

        int[] freq = new int[26];
        //0->a, 1->b, 2->c ,..., 25->z
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int idx = (int)ch - 97;
            freq[idx]++;
           // freq[(int)str.charAt(i) - 97]++;
        }
        int maxFreq = -1;
        for (int i = 0; i < freq.length ; i++) {
            maxFreq = Math.max(maxFreq,freq[i]);
        }
        for (int i = 0; i < freq.length ; i++) {
            if(freq[i] == maxFreq){
                char ch = (char)(i+97);
                System.out.println(ch+" ");
            }
        }


//
    }
}
//    StringBuilder sb = new StringBuilder(str);
//
//        int maxcount = 0;
//        char maxch = ' ';
//        for (int i = 0; i < sb.length() ; i++)
//        {
////            char ch = sb.charAt(i);
////            int count = 0;
////            for (int j = 1; j < sb.length(); j++) {
////                if(ch == sb.charAt(j)){
////                    sb.delete(j,j+1);
////                    count++;
////                }
////            }
////            if(count >= maxcount){
////                maxcount = count;
////                maxch = ch;
////            }
//        }
//        System.out.println(maxch);
//        System.out.println(maxcount);
