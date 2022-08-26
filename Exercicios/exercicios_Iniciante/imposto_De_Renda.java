package exercicios_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class imposto_De_Renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <=2000) {
			imposto = 0;}
			else if (salario <=3000) {
				imposto = (salario - 2000)*0.08;} 
				else if(salario <=4500) {
					imposto = 0.18*(salario-3000) + (0.08*1000);} 
				else {
				imposto = 0.28*(salario-4500)+(1500*0.18)+(1000*0.08);}
		if (imposto == 0) {
			System.out.println("Isento");}
		else {
			System.out.printf("R$ %.2f%n", imposto);}
		sc.close();
	}
}
