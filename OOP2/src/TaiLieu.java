public class TaiLieu {
    private int maTL;
    private String tenNXB;
    private int soBPH;

    public TaiLieu(int maTL) {
        this.maTL = maTL;
    }

    public TaiLieu(int maTL, String tenNXB, int soBPH) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soBPH = soBPH;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBPH() {
        return soBPH;
    }

    public void setSoBPH(int soBPH) {
        this.soBPH = soBPH;
    }

    @Override
    public String toString() {
        return "maTL=" + maTL +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBPH=" + soBPH ;
    }
}
