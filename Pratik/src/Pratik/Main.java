package Pratik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int k1, k2, k3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�lk kenar� giriniz : ");
		k1 = scanner.nextInt();
		
		System.out.println("�kinci kenar� giriniz : ");
		k2 = scanner.nextInt();
		
		System.out.println("Son kenar� giriniz : ");
		k3 = scanner.nextInt();
		
		double u = (k1 + k2 + k3) / 2;
		
		double cevre = 2 * u;
		
		double alan = u * (u - k1) * (u - k2) * (u - k3);
		
		System.out.println("��genin �evresi : " + cevre);
		System.out.println("�genin alan� : " + alan);
		
		
	}

}
