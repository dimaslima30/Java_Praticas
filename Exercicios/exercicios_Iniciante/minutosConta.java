package exercicios_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class minutosConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutes = sc.nextInt();
		
		double billPrice = 50.0;
		if (minutes > 100) {
			billPrice += (minutes - 100)*2;
		}
		System.out.printf("Bill price = $ %.2f", billPrice);
	}

}
