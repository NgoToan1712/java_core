import java.util.Arrays;
//là một tập hợp các hằng số được xác định trước.
public class Main {
    //giá trị đại điện cho 1 khoảng
    //mỗi giá trị tạo ra là duy nhất
    //muốn quy v
    enum HocLuc {
        TrungBinh("6"), Kha("7"), Gioi("8"), XuatSac("10");
        private String abb;
        private HocLuc(String abb){
            this.abb=abb;
        }
        public String getAbb(){
            return abb;
        }

    }

    public static void main(String[] args) {
        HocLuc hocLuc = HocLuc.Kha;
        System.out.println(hocLuc.toString());

        //in ra danh sách giá trị đại diện
        HocLuc []hocLucs = HocLuc.values();
        System.out.println(Arrays.toString(hocLucs));
        HocLuc h=HocLuc.XuatSac;
        System.out.println(h.getAbb());
    }
}
