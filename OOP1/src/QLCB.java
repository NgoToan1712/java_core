import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLCB {
   static List<CanBo> list = new ArrayList<>();
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("1.Thêm mới cán bộ");
            System.out.println("2.Tìm kiếm theo họ tên");
            System.out.println("3.Hiển thị thông tin danh sách cán bộ");
            System.out.println("4.Thoát");
            System.out.println("Chọn:");
            n = (new Scanner(System.in)).nextInt();
            switch (n) {
                case 1:
                    themCanbo();
                    break;
                case 2:
                    timKiem();
                    break;
                case 3:
                    hienThi();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn lại:");
                    break;

            }
        } while (n != 4);
    }
    //thêm cán bộ
    static void themCanbo(){
        System.out.println("1.1.Thêm Công nhân");
        System.out.println("1.2.Thêm Kỹ sư");
        System.out.println("1.3. Thêm Nhân viên");
        System.out.println("---Chọn:");
        int k=(new Scanner(System.in)).nextInt();
        System.out.println("Nhập họ tên:");
        String hoTen=(new Scanner(System.in)).nextLine();
        System.out.println("Nhập tuổi:");
        int tuoi=(new Scanner(System.in)).nextInt();
        System.out.println("Nhập giới tính:");
        String gioiTinh=(new Scanner(System.in)).nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi=(new Scanner(System.in)).nextLine();
        if(k==1){
            System.out.println("Nhập bậc của công nhân:");
            int bac=(new Scanner(System.in)).nextInt();
            CanBo c= new CongNhan(hoTen,tuoi,gioiTinh,diaChi,bac);
            list.add(c);

        }else if(k==2){
            System.out.println("Nhập ngành đào tạo:");
            String nganhDaoTao=(new Scanner(System.in)).nextLine();
            CanBo c=new KySu(hoTen,tuoi,gioiTinh,diaChi,nganhDaoTao);
            list.add(c);
        }else if(k==3){
            System.out.println("Nhập công việc:");
            String cv=(new Scanner(System.in)).nextLine();
            CanBo c=new NhanVien(hoTen,tuoi,gioiTinh,diaChi,cv);
            list.add(c);
        }
    }
    //Tìm kiếm theo họ tên
    static void timKiem() {
        System.out.println("Nhập họ tên cần tìm kiếm:");
        String hoten = (new Scanner(System.in)).nextLine();
//        for (CanBo b : list) {
//            if (b.getHoTen().contains(hoten)) {
//                if (b instanceof CongNhan) {
//                    System.out.println(((CongNhan) b).toString());
//                } else if (b instanceof KySu) {
//                    System.out.println(((KySu) b).toString());
//                } else if (b instanceof NhanVien) {
//                    System.out.println(((NhanVien) b).toString());
//                }
//            }
//
//        }
        List<CanBo> list2=  list.stream().filter(item-> item.getHoTen().contains(hoten)).collect(Collectors.toList());
        hienThi(list2);
        QLCB c=new QLCB();
    }
    // Hiển thị
    static void hienThi(){
        System.out.println("3.1. Hiển thị tất cả");
        System.out.println("3.2. Hiển thị Công nhân");
        System.out.println("3.3. Hiển thị Kỹ sư");
        System.out.println("3.4. Hiển thị Nhân viên");
        System.out.println("---Chọn:");
        int k=(new Scanner(System.in)).nextInt();
        for(CanBo c: list){
            if(k==1){
                System.out.println(c.toString());
            }else if(k==2){
                if(c instanceof CongNhan){
                    System.out.println(((CongNhan) c).toString());
                }
            }else if(k==3){
                if(c instanceof KySu){
                    System.out.println(((KySu) c).toString());
                }
            }else if(k==4){
                if(c instanceof NhanVien){
                    System.out.println(((NhanVien) c).toString());
                }
            }
        }
    }
    public  void hienThi(List<CanBo> list){
        for(CanBo b:list){
            System.out.println(b.toString());
        }
    }
}
