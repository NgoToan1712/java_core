import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
//cho phép truyeenf kiểu dữ liệu mà danh sách quản lý
        //Dùng để tham số hóa kiểu dữ liệu
        //k-key,v-value,e-elemtment(đối tg dùng j cũng đc),T,N
//        Contrller<String> c=new Contrller<>();
//        c.add("A");
//        c.add("b");
//        System.out.println(c.get(1));
        //nếu extend thì truyền vào phải ừ people trở lên
        Contrller<Student> list2=new Contrller<>();
        String str="hello";
       // list2.add(str);
        list2.add(new Student("R1","a"));
        System.out.println(list2.get(0).fullName);
        HashMap<String,Student> hashMap=new HashMap<>();
        Student student=new Student("R2","Nguyễn Thị Hiền");
        hashMap.put(student.id,student);
        System.out.println(hashMap.get("R2").fullName);
    }
}
