import java.util.ArrayList;
//tham số hóa kiểu dữ liệu. 
public class Contrller<H > {
    ArrayList<H> list = new ArrayList<>();

    public Contrller() {
    }

    public void add(H e) {
        list.add(e);

    }

    public H get(int index) {
        return list.get(index);
    }

}
