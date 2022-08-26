package exercicios_Iniciante;

import java.util.Scanner;

public class Diferenca_Produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C,D, Diferenca;
		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		D = sc.nextInt();
		
		Diferenca = (A*B)-(C*D);
		System.out.println("DIFERENCA = "+ Diferenca);
	}

}
