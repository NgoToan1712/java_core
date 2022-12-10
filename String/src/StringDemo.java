public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        String s0 = s + "Java";
        System.out.println(s0);
       // connect(s);
        connect1(s1);
        connect2(s2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }

    static void connect(String s) {
        s = s + "Java";
        System.out.println("-------"+s);
    }

    static void connect1(StringBuilder s) {
        s.append("Java");
    }

    static void connect2(StringBuffer s) {
        s.append("Java");
    }

}

