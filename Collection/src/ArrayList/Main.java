package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.remove(0);
        list.add(0,"A1");
        list.add(2,"ab");
        list.forEach((i) -> System.out.println(i));
        System.out.println("-----------------------");
        //c2
        list.set(2,"abc");
        Iterator<String> iterator=list.iterator();
        //kiểm tra phần tử này có khả năng đến ptuwr tiếp theo không
        while (iterator.hasNext()){
            String name=iterator.next();
            System.out.println(name);
        }

    }
}
