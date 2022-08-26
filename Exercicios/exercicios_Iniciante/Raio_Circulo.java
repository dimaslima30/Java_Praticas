
package exercicios_Iniciante;
import java.util.Locale;
import java.util.Scanner;

public class Raio_Circulo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, raio;
		raio = sc.nextDouble();
		area = 3.14159* Math.pow(raio, 2);
		System.out.printf("A=%.4f%n", area);
			
	}

}
