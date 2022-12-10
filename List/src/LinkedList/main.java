package LinkedList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String> monHoc=new LinkedList<>();
        //thêm ptuwr vào danh sách liên kết
        monHoc.add("toán");
        monHoc.add("văn");
        monHoc.add("sử");
        System.out.println("Danh sách môn học");
        for(String str:monHoc){
            System.out.println(str);
        }

        System.out.println("thêm pần tử vào đầu danh sách liên kết");
        monHoc.addFirst("địa");
        System.out.println("Danh sách môn học");
        for(String str:monHoc){
            System.out.println(str);
        }

        System.out.println("thêm phần tử vào cuối danh sách");
        monHoc.addLast("lý");
        System.out.println("Danh sách môn học");
        for(String str:monHoc){
            System.out.println(str);
        }



    }
}
