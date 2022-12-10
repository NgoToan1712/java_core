public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;
    private int ngayPH;

    public TapChi(int maTL) {
        super(maTL);
    }

    public TapChi(int maTL, int soPH, int thangPH, int ngayPH) {
        super(maTL);
        this.soPH = soPH;
        this.thangPH = thangPH;
        this.ngayPH = ngayPH;
    }

    public TapChi(int maTL, String tenNXB, int soBPH, int soPH, int thangPH, int ngayPH) {
        super(maTL, tenNXB, soBPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
        this.ngayPH = ngayPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    public int getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public String toString() {
        return "TapChi{" +super.toString()+
                "soPH=" + soPH +
                ", thangPH=" + thangPH +
                ", ngayPH=" + ngayPH +
                '}';
    }
}
