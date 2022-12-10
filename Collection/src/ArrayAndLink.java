import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLink {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        long start, end;
        for (int i = 0; i < 10000000; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 10000000; i++) {
            list2.add(i);
        }
//add phần tử
        start = System.currentTimeMillis();
        list1.add(50000, 8);
        end = System.currentTimeMillis();
        System.out.println("Thời gian thêm phần tử của arrayList: " + (end - start));


        start = System.currentTimeMillis();
        list2.add(50000, 8);
        end = System.currentTimeMillis();
        System.out.println("Thời gian thêm phần tử của LinkedList: " + (end - start));
//truy xuất phần ử
        start = System.currentTimeMillis();
        System.out.println(list1.get(50000));
        end = System.currentTimeMillis();
        System.out.println("Thời gian truy xuất phần tử của arrayList: " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(list2.get(50000));
        end = System.currentTimeMillis();
        System.out.println("Thời gian truy xuất phần tử của LinkedList: " + (end - start));
        //duyệt mảng
        start = System.currentTimeMillis();
        for (int i = 0; i < list1.size(); i++) {

        }

        end = System.currentTimeMillis();
        System.out.println("Thời gian duyệt của arrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < list2.size(); i++) {

        }
        end = System.currentTimeMillis();
        System.out.println("Thời gian duyệt của LinkedList: " + (end - start));

        //
    }
}