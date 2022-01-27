package Pratik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int k1, k2, k3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ýlk kenarý giriniz : ");
		k1 = scanner.nextInt();
		
		System.out.println("Ýkinci kenarý giriniz : ");
		k2 = scanner.nextInt();
		
		System.out.println("Son kenarý giriniz : ");
		k3 = scanner.nextInt();
		
		double u = (k1 + k2 + k3) / 2;
		
		double cevre = 2 * u;
		
		double alan = u * (u - k1) * (u - k2) * (u - k3);
		
		System.out.println("Üçgenin çevresi : " + cevre);
		System.out.println("Ügenin alaný : " + alan);
		
		
	}

}
