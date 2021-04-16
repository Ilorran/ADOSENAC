package q2_ado1;
import java.util.Scanner;

public class ADO1_Q2 {
	public static void main(String[] args) {
		System.out.println("Vamos descobrir sua idade total em dias?");
		
		System.out.print("Dia do mês atual: ");
		Scanner teclado = new Scanner(System.in);
		int d1 = teclado.nextInt();
		
		System.out.print("Mês atual:  ");
		Scanner teclado1 = new Scanner(System.in);
		int m1 = teclado.nextInt();
		
		System.out.print("Sua idade:  ");
		Scanner teclado2 = new Scanner(System.in);
		int a1 = teclado.nextInt();

		int amd;
		amd = ((a1 * 365) + (30 * m1) + d1);
		System.out.println("Você tem " + amd + " dias de idade!");
	}

}
// código pronto.