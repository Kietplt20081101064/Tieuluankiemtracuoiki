package baikiemtracuoiky;

public abstract class HangHoa {
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;
    public Object sc;
    public HangHoa() {
        maHang=new String();
        tenHang=new String();
        soLuongTon=0;
        donGia=0;
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public abstract double getVAT();
    @Override
    public String toString() {
        return "hangHoa [donGia=" + donGia + ", maHang=" + maHang + ", soLuongTon=" + soLuongTon + ", tenHang="
                + tenHang + "]";
    }
    public void duLieuCoSan() {
    }
    public void xuat() {
    }
    public HangHoa inPutHangHoa() {
        return null;
    }
    public void them(HangHoa hangHoa) {
    }
} 
