package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("a");
        setString.add("b");
        setString.add("d");
        setString.add("c");
        setString.add("b");
for(String s:setString){
    System.out.println(s);
}
//set không đảm bảo thứ ự của phần t nhập vào cũng như set là phần tử duy nhất
       setString.remove("a");
    }
}
