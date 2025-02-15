package lab1;

import java.util.Scanner;

public class Lab1bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập canh của khối lập phương: ");
        double canh = scanner.nextDouble();
        
        double v = Math.pow(canh, 3);
        
        System.out.println("Thể tích của khối lập phương: " + v);
	}

}
