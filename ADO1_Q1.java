package ado1;
import java.util.Scanner;
public class ADO1_Q1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos sal�rios m�nimos voc� recebe? Venha descobrir!");
		System.out.print("Digite o seu sal�rio (com ou sem centavos): ");
		float salr = teclado.nextFloat();
		float salf;
		salf = (salr / 1100);
		System.out.println("Voc� recebe aproximadamente: "  + String.format("%.2f", salf) + " sal�rios m�nimos!");		
	}

}
//C�digo pronto
