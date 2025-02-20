import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Nhập số điện sử dụng tháng này: ");
	     int soDien = scanner.nextInt();
	        
	     double tien=0;
	     if (soDien <= 50) {
	         tien = soDien *1000;
	     }
	     else {
	         tien = 50*1000 + (soDien - 50)*1200;
	     }
	     System.out.println("Số Tiền Điện Tháng Này: " + tien + "VND");

	}

}
