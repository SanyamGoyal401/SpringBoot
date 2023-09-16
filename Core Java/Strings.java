public class Strings {
    public static void main(String[] args) {
        String s = new String("hello");

        s = s + " sanyam";
        System.out.println(s);
        System.out.println(s.hashCode());

        String s1 = "sanyam";
        String s2 = "sanyam";

        System.out.println(s1 == s2);

        /*
         * Mutable Strings - String Builder, String Buffer
         * String Buffer is thread safe and String builder is not.
         */

        StringBuffer sf = new StringBuffer(s1);
        System.out.println("capacity = " + sf.capacity());
        System.out.println("length = " + sf.length());
        System.out.println(sf.toString());
        System.out.println(sf.deleteCharAt(2));
        System.out.println(sf.insert(0, " hello"));
        sf.ensureCapacity(100);
        System.out.println(sf.capacity());
        
    }
}
