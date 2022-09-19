public class Strings {
    public static void main(String[] args) {
        String a="nd";
        String b="nd";
        System.out.println(a==b);
        // This will give me a true
        String n=new String("nd");
        String d= new String("nd");
        System.out.println(n==d);
        // this wil give me false
        // if we only want check values then use this
        System.out.println(n.equals(d));
    }
}
