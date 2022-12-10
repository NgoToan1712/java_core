public class StringPool {
    public static void main(String[] args) {
        String s1 = "java";
        //s1 đc luu trong String pool của java
        String s2 = "java";
        String s3 = "python";
        System.out.println(s1 + s3);
        String s4 = new String("java");//dặt trong heap
        System.out.println(s4.intern()); //vào pool kiểm tra xem có chưa nếu có thì trả về nếu chưa có thì tạo ra ở pool

        System.out.println(s1==s4);
        System.out.println(s1==s2);//true cùng trỏ vào 1 đtg

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));

    }
}
