package exercicios_Iniciante;
import java.util.Locale;
import java.util.Scanner;

public class Total_A_Pagar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String Id1, Id2;
		int N1, N2;
		double P1, P2, Total;
		Id1 = sc.next();
		N1 = sc.nextInt();
		P1 = sc.nextDouble();
		sc.nextLine();
		Id2 = sc.next();
		N2 = sc.nextInt();
		P2= sc.nextDouble();
		Total = (N1*P1)+(N2*P2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", Total);
		
	}

}
