package Test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(10);
        //Truyền thống
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;

            }
        });
        System.out.println(list.toString());

        System.out.println("---------------------");
        list.sort((o1,o2)->o2-o1);
        System.out.println(list.toString());
        //sử dụng cú pháp đầy đủ
        list.sort((o1,o2)->{
            return o2-o1;
        });
        System.out.println(list.toString());
    }
}
