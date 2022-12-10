import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    static List<TaiLieu> list=new ArrayList<>();

    public static void main(String[] args) {
        int n;
        do{
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xóa tài liệu");
            System.out.println("3. Hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu");
            System.out.println("5. Thoát");
            System.out.println("Chọn:");
            n=(new Scanner(System.in)).nextInt();
            switch (n){
                case 1:
                    themTaiLieu();
                    break;
                case 2:
                    xoaTaiLieu();
                    break;
                case 3:
                    hienThiTaiLieu();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lựa chọn khác");
                    break;
            }
        }while (n!=5);
    }
    //Thêm mới về tài liệu
    static void themTaiLieu(){
        System.out.println("1.1. Thêm Sách");
        System.out.println("1.2. Thêm Tạp Chí");
        System.out.println("1.3. Thêm Báo");
        int k=(new Scanner(System.in)).nextInt();
        System.out.println("Nhập mã tài liệu");
        int maTL=(new Scanner(System.in)).nextInt();
        System.out.println("Nhập tên nhà xuất bản");
        String  NXB=(new Scanner(System.in)).nextLine();
        System.out.println("Nhập số bản phát hành");
        int soBPH=(new Scanner(System.in)).nextInt();
        if(k==1){
            System.out.println("Nhập tên tác giả");
            String tenTG=(new Scanner(System.in)).nextLine();
            System.out.println("Nhập số trang");
            int soTrang=(new Scanner(System.in)).nextInt();
            TaiLieu t=new Sach(maTL,NXB,soBPH,tenTG,soTrang);
            list.add(t);
        }else if(k==2){
            System.out.println("Nhập số phát hành");
            int soPH=(new Scanner(System.in)).nextInt();
            System.out.println("Nhập thang phát hành");
            int thangPH=(new Scanner(System.in)).nextInt();
            System.out.println("Nhập ngay phát hành");
            int ngayPH=(new Scanner(System.in)).nextInt();
            TaiLieu t=new TapChi(maTL,NXB,soBPH,soPH,thangPH,ngayPH);
            list.add(t);
        }else if(k==3){
            int ngayPH=(new Scanner(System.in)).nextInt();
            TaiLieu t=new Bao(maTL,NXB,soBPH,ngayPH);
            list.add(t);
        }
    }
    //xóa tài liệu
    static void xoaTaiLieu(){
        System.out.println("Nhập mã tài liệu cần xóa");
        int k=(new Scanner(System.in)).nextInt();
        int c=0;
        for(int i=0; i<list.size();i++){
            if(k==list.get(i).getMaTL()){
                list.remove(i);
                c=1;
            }
        }
        if(c==1){
            System.out.println("Xóa thành công");
        }else{
            System.out.println("Không tìm thấy tài liệu có mã "+k);
        }
    }
    //Hiển thị tài liệu
    static void hienThiTaiLieu(){
        for(TaiLieu t:list){
            System.out.println(t.toString());
        }
    }
    //tìm kếm tài liệu theo loại
    static void timKiem(){
        System.out.println("4.1. Theo Sách");
        System.out.println("4.2. Theo Tạp chí");
        System.out.println("4.3. Theo Báo");
        System.out.println("Chọn");
        int k=(new Scanner(System.in)).nextInt();
        for(TaiLieu t:list){
            if(k==1){
                if(t instanceof Sach){
                    System.out.println(((Sach) t).toString());
                }
            }else if(k==2){
                if(t instanceof TapChi){
                    System.out.println(((TapChi) t).toString());
                }
            } else if(k==3){
                if(t instanceof Bao){
                    System.out.println(((Bao) t).toString());
                }
            }
        }
    }
}
