package baikiemtracuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class DanhSachHangHoa {
    List<HangHoa> list = new ArrayList<>();
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private List<HangHoa> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void duLieuCoSan() throws ParseException
    {
        list.add(new HangThucPham("Thịt", "Thực phẩm", "01", 30, 15.000, simpleDateFormat.parse("1/7/2020"), simpleDateFormat.parse("1/7/2022")));
        list.add(new HangThucPham("Cá", "Thực phẩm", "02", 40, 20.000, simpleDateFormat.parse("2/2/2021"), simpleDateFormat.parse("2/2/2022")));
        list.add(new HangThucPham("Trứng", "Thực phẩm", "03", 50, 25.000, simpleDateFormat.parse("30/4/2021"), simpleDateFormat.parse("30/4/2022")));
        list.add(new HangThucPham("Rau củ", "Thực phẩm", "04", 100, 2.000, simpleDateFormat.parse("25/3/2022"), simpleDateFormat.parse("30/3/2022")));
        list.add(new HangDienMay("Điện thoại", "Điện máy", "10", 100, 150.000, "24 tháng", "1KW"));
        list.add(new HangDienMay("Máy tính xách tay", "Điện máy", "20", 150, 200.000, "36 Tháng", "100KW"));
        list.add(new HangDienMay("Máy tính bàn", "Điện máy", "30", 300, 100.000, "24 tháng", "100KW"));
        list.add(new HangDienMay("Tivi", "Điện máy", "40", 350, 75.000, "36 tháng", "100KW"));

    }

    public void them(HangHoa hangHoa)
    {
        this.ds.add(hangHoa);
    }

    public HangHoa inPutHangHoa() throws ParseException
    {
        HangHoa hangHoa = null;

        System.out.println("Tên hàng: ");
        String tenHang = sc.nextLine();
        System.out.println("Mã hàng: ");
        String maHang = sc.nextLine();
        System.out.println("Số lượng tồn kho: ");
        int soLuongTonKho = sc.nextInt();
        System.out.println("Đơn giá: ");
        double donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Loại hàng: 1 (thực phẩm) | 2 (điện máy) | 3 (sành sứ) ");
        String loaiHang = sc.nextLine();

        
        if(loaiHang.equalsIgnoreCase("1"))
        {
            System.out.println("Ngày sản xuất: ");
            Date ngaySX = simpleDateFormat.parse(sc.nextLine());
            System.out.println("Ngày hết hạn: ");
            Date ngayHetHan = simpleDateFormat.parse(sc.nextLine());
            hangHoa = new HangThucPham(tenHang, loaiHang, maHang, soLuongTonKho, donGia, ngaySX, ngayHetHan);
        }
        else if(loaiHang.equalsIgnoreCase("2"))
        {
            System.out.println("Thời gian bảo hành: ");
            String tGBaoHanh = sc.nextLine();
            System.out.println("Công suất(KW): ");
            String congSuatKW = sc.nextLine();

            hangHoa = new HangDienMay(tenHang, loaiHang, maHang, soLuongTonKho, donGia, tGBaoHanh, congSuatKW);
        }
        else
        {
            System.out.println("Loại hàng không có trong kho");
        }
        return hangHoa;
    }

    
   public void xuatToanBoDanhSach()
    {
        for(int i=0; i<list.size();i++)
            System.out.println((i+1)+" - "+list.get(i).toString()+" , VAT : "+(list.get(i).getVAT()*100)+"%");
    } void xuat()
    {
        for(HangHoa hangHoa : list)
        {
            System.out.println(hangHoa);
        }
    }
    public void xoaHangHoa()
    {
        String ma,tenHang;
        Scanner tt = new Scanner(System.in);
        int i=0;
        System.out.print("Nhap ma hang : ");
        ma=tt.nextLine();
        for(i=0;i<list.size();i++)
                if(list.get(i).getMaHang().compareTo(ma)==0)
                    break;
        if(i<list.size())
        {
            list.remove(i);
            System.out.println("Xoa thanh cong");
        }
            else
                System.out.println("Ma hang khong ton tai !");
    }
    public void sapXepGiamDanTheoSoLuongTonKho()
    {
        for(int i=0; i<list.size()-1;i++)
            for(int j=0; j<list.size();j++)
                if(list.get(i).getSoLuongTon()<list.get(j).getSoLuongTon())
                {
                    HangHoa t=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,t);
                }
    }
}
