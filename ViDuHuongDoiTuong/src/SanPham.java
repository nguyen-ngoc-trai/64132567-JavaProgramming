
public class SanPham {
	//Định nghĩa các thuộc tính 
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP;
	
	//Hàm tạo
	public SanPham() {
		
	}
	
	public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP ) {
		//khởi tạo giá trọ ban đầu cho các thuộc tính có ở đây 
		maSP = _maSP;
		tenSP = _tenSP;
		anhSP = _anhSP;
	}
	
	//Các getter, setter
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", anhSP=" + anhSP + "]";
	}

	
	
}
