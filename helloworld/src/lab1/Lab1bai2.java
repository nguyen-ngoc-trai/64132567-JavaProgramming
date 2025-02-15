package lab1;

import java.util.Scanner;

public class Lab1bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner

        System.out.print("Nhập chiều dài: ");
        double cd = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double cr = scanner.nextDouble();

		double cv = 2*(cd + cr);
		double dt = cd * cr;
		double canhmin = Math.min(cd, cr);
		
		 System.out.println("Chu vi hình chữ nhật: " + cv);
	        System.out.println("Diện tích hình chữ nhật: " + dt);
	        System.out.println("Cạnh nhỏ hơn: " + canhmin);
	}
	

}
