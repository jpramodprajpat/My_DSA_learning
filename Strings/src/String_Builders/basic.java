package String_Builders;
public class basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder ab = new StringBuilder(10);
        System.out.println(ab);
        System.out.println(ab.capacity());
        System.out.println(ab.length());
    }
}
