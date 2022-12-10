package Test1;


public class PrintableDemo {
    public static void main(String[] args) {
        IPrintable obj = new IPrintable() {
            @Override
            public void print(int a) {
                System.out.println("a: " + a);
            }
        };
        obj.print(10);
//dùng lambda để mô tả phương thức print
        IPrintable p1 = (a) -> System.out.println("a==" + a);
        p1.print(20);
        //20 sẽ được truyềnvaofof phần tham số của lambda và gọi câu lệnh sout v được hển thị ra
        compare(a -> System.out.println(" a=== " + a));

    }

    public static void compare(IPrintable printable) {
        printable.print(30);
    }
}
