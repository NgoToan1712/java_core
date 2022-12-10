package Test1;

import java.util.HashMap;
import java.util.Map;

public class LambdaMapDemo {
    public static void main(String[] args) {
        Map<String,Staff> map=new HashMap<>();
        map.put("K01", new Staff("1","user1"));
        map.put("K02", new Staff("2","user2"));
        //truyền thống
        for(Map.Entry<String,Staff> entry:map.entrySet()){
            String key=entry.getKey();
            Staff value=entry.getValue();
            System.out.println(String.format("%s -%s -%s",key,value.getId(),value.getName()));
        }
        //
        System.out.println("------------------------------");
        map.forEach((key,value)->System.out.println(String.format("%s -%s -%s",key,value.getId(),value.getName())));

    }
}
