package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaCollection {
    public static void main(String[] args) {
        List<Staff> list = new ArrayList<>();
        list.add(new Staff("1", "Anh"));
        list.add(new Staff("2", "MInh"));
        //
        list.forEach(item-> System.out.println(item.toString()));
    }

}
