import java.util.Locale;

public class StringBui {
    public static void main(String[] args) {
        String a="";
        for (int i = 0; i < 5; i++) {
       char ch= (char) ('a'+ i);
       a+=ch;
        }
        System.out.println(a);
        //the upper loop will create new object for every time so storage is wasted

        StringBuilder nd= new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char ch= (char) ('a'+ i);
        nd.append(ch);
        }
        System.out.println(nd.toString());
        //In string builder char directly gets connected to the string it does not create
        //new object so lots of space saved
    }
}
