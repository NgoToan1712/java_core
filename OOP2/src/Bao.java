public class Bao extends TaiLieu{
    private int ngayPH;

    public Bao(int maTL) {
        super(maTL);
    }

    public Bao(int maTL, int ngayPH) {
        super(maTL);
        this.ngayPH = ngayPH;
    }

    public Bao(int maTL, String tenNXB, int soBPH, int ngayPH) {
        super(maTL, tenNXB, soBPH);
        this.ngayPH = ngayPH;
    }

    public int getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public String toString() {
        return "Bao{" +super.toString()+
                "ngayPH=" + ngayPH +
                '}';
    }
}
