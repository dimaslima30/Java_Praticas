package exercicios_Iniciante;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		soma = a+b;
		System.out.println("SOMA = "+ soma);
	}

}
