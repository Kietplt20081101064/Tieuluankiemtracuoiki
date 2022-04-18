package baikiemtracuoiky;

public class HangDienMay extends HangHoa{

    private String tGBaoHanh;
    private String congSuatKW;
    

    public HangDienMay(String tGBaoHanh, String congSuatKW) {
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }

    public HangDienMay(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia,
            String tGBaoHanh, String congSuatKW) {
        super();
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }

    @Override
    public String toString() {
        return super.toString()+ " Thời gian bào hành: " +tGBaoHanh+ " Công suất KW: " +congSuatKW ;
    }

    @Override
    public double getVAT() {
       
        return 0;
    }
    
}