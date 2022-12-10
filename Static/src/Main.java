public class Main {
    public static int id = 1000;
    public static String Mess = "hello";
    private int mid;

    public Main() {
        mid = id++;
        this.show();
        show();
        Main.show();
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public static void show() {
        System.out.println("static id: " + id);
    }

    public static void main(String[] args) {
        Main s1 = new Main();
        Main s2 = new Main();
        Main s3 = new Main();
        Main s4 = new Main();
        Main s5 = new Main();
        Main s6 = new Main();
        Main s7 = new Main();
        Main s8 = new Main();
//        System.out.println(s1.getMid());
//        System.out.println(s2.getMid());
//        System.out.println(s3.getMid());
//        System.out.println(s4.getMid());
    }
}
