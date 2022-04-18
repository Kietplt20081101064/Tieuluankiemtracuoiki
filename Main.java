package baikiemtracuoiky;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException{
    Scanner sc = new Scanner(System.in);
    DanhSachHangHoa a = new DanhSachHangHoa();
    int x;
        do{
        
            System.out.println("\n-------MENU-------");
            System.out.println("\n1.-Them hang hoa--");
            System.out.println("\n2.-Xuat danh sach-");
            System.out.println("\n3.--Xoa Hang Hoa--");
            System.out.println("\n4.-sapXepGiamDan--");
            x =sc.nextInt();
            switch(x)
            {
                case 1 :
                
                    a.inPutHangHoa();
                    break;
                
                case 2 :
                
                    a.xuatToanBoDanhSach();
                    break;
                case 3 :
                    a.xoaHangHoa();
                    break;
                case 4 :
                    a.sapXepGiamDanTheoSoLuongTonKho();
                    break;

                
            }
             } while(x!=0);
             System.out.println("");     
        }
    }
