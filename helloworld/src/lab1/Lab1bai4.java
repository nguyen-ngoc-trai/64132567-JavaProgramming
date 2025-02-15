package lab1;

import java.util.Scanner;

public class Lab1bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        double sqrtDelta = Math.sqrt(delta);

        System.out.println("Delta: " +delta);
        if (delta >= 0){ 
        	System.out.println("Căn delta: " + sqrtDelta);
        }
        else {
            System.out.println("Delta âm, không có căn bậc hai ");
        }
	}

}
