package Test1;

import java.util.ArrayList;
import java.util.List;

public class SimpleLambdaExpression {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        // dueet mảng
        list.forEach(item -> System.out.println(item));
        //tham chiếu tới pthuwc println và hiển thị nội dung bởi pthuwcs println
        list.forEach(System.out::println);
    }
}
