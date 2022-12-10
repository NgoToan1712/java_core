package ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        //Thêm pần tử vào cuối danh sách
        car.add("car1");
        car.add("car2");
        car.add("car3");
        for (String str : car) {
            System.out.println(str);
        }


        System.out.println("Thêm phần tử vị trí bất kì");
        //Thêm phần tử vào vị trí bất kỳ
        car.add(2, "car4");
        for (String str : car) {
            System.out.println(str);
        }


        System.out.println("xóa phần tử có values=car1");
        //xóa phần tử có values=?
        car.remove("car1");
        for (String str : car) {
            System.out.println(str);
        }


        System.out.println("xóa phần tử ở vị trí 1");
        //xóa phần tử tại vị trí i
        car.remove(1);

        //Suawr giá trị
        System.out.println("cập nhật giá trị tại vị trí i");
        car.set(1, "car7");
        for (String str : car) {
            System.out.println(str);
        }

        //duyệt mảng
        car.forEach((item) -> {
            System.out.println(item);
        });


    }
}
