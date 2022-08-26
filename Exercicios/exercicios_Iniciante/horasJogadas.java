package exercicios_Iniciante;

import java.util.Scanner;

public class horasJogadas {

	public static void main(String[] args) {
		int hora1, hora2, horasJogadas;
		Scanner sc = new Scanner(System.in);
		hora1 = sc.nextInt();
		hora2 = sc.nextInt();
		horasJogadas = (24-hora1) + hora2;
		System.out.printf("O JOGO DUROU %d HORA(S)", horasJogadas);
	}

}
