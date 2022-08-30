package exercicios_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		double discount = (price < 20)? price*0.1 : price*0.05;
		double finalPrice = price - discount;
		
		System.out.printf("Your discount is $ %.2f and the final price is $ %.2f", discount, finalPrice);

	}

}
