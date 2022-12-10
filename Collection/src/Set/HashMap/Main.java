package Set.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        //lưu trữ kiểu key,value
        map.put("fullname","Tran Van Diep");
        map.put("age","10");
        map.put("address","Ha Noi");
        System.out.println(map.get("fullname"));
        //ưu:

        HashMap<String,Student> s=new HashMap<>();
        Student std=new Student("R1","Tran van A");
        s.put(std.id,std);
        std=new Student("R2","Tran van B");
        s.put(std.id,std);
        Student std2=s.get("R1");
        System.out.println(std2.toString());
        //cách duyệt các phần tử
        Set<String> keys=s.keySet();
        keys.forEach((key)-> System.out.println(key));
//kiểm tra xem tồn tại key ko
        System.out.println(  s.containsKey("R1"));
    }
}
