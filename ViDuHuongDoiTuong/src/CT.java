import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Bánh Chuối", "Đồ Ăn Nhanh", "bc.jdg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SG");
		sp1.setLoaiSP("Đồ Uống");
		sp1.setAnhSP("dc.jdg");
		
		//In ra màn hình 2 thông tin sản phâm
		String thongtinsp1 = sp1.toString();
		String thongtinsp2 = "Mã sp2 là " + sp2.getMaSP();
		       thongtinsp2 +=" Tên sp2 là " + sp2.getTenSP();
		
		System.out.println(thongtinsp1);
		System.out.println(thongtinsp2);
			
	
		//Khai báo danh sách sản phẩm
	     ArrayList<SanPham> dsSanPham = new ArrayList<>();
		
		//Nhap 3 san pham 
	    SanPham sp3 = new SanPham(0, "Kem", "Giải Khát", null);
		SanPham sp4 = new SanPham(5, "Cơm", "Đồ Ăn", null);
		SanPham sp5 = new SanPham(3, "Phở", "Đồ Ăn", null);
	
		dsSanPham.add(sp3);
	    dsSanPham.add(sp4);
	    dsSanPham.add(sp5);
		
		for (int i=0; i<dsSanPham.size() ;i++) {
			{
			SanPham sp = dsSanPham.get(i);
			System.out.println(dsSanPham.get(i).toString());
			}
		}
    }
}