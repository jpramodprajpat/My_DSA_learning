import java.util.Arrays;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
            // ek kaam ko 2 baar karna hai => s->t and t->s
            char[] a = new char[128];

            // s->t
            for(int i = 0 ; i<s.length() ; i++){
                char ch = s.charAt(i) , dh = t.charAt(i);
                int idx = (int)ch; // konse index par store karna
                if(a[idx] =='\0'){ // check agar wo index khali hai - to add kar de
                    a[idx] = dh;
                }else{  // index par koi hai pehle se
                    if(a[idx] != dh){ // index ki old doesnt match with this new value
                        return false;
                    }
                }
            }

            //array ko khali karo -> reuse karna hai isliye
            Arrays.fill(a,'\0');

            // t->s
            for(int i = 0 ; i<t.length() ; i++){
                char ch = t.charAt(i) , dh = s.charAt(i);
                int idx = (int)ch;
                if(a[idx] == '\0') a[idx] = dh;
                else {
                    if(a[idx] != dh) return false;
                }

            }
            return true;
        }

}
