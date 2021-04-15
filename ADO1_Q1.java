package ado1;
import java.util.Scanner;
public class ADO1_Q1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos salários mínimos você recebe? Venha descobrir!");
		System.out.print("Digite o seu salário (com ou sem centavos): ");
		float salr = teclado.nextFloat();
		float salf;
		salf = (salr / 1100);
		System.out.println("Você recebe aproximadamente: "  + String.format("%.2f", salf) + " salários mínimos!");		
	}

}
//Código pronto
