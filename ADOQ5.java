package adoq5;
import java.util.Scanner;

public class ADOQ5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos debrulhar seu sal�rio para vermos seus encargos");
		System.out.print("Digite o seu sal�rio bruto: ");
		float salb = teclado.nextFloat();
		
		float salf, sainss, sair, sabl;
		
		sainss = (0.08f * salb);
		
		sair = (0.15f * salb);
		
		salf = (salb - (sair + sainss));
		
		sabl = (0.0575f * salf);
		
		salf = sabl + salf;
		
		System.out.println("Desconto do INSS �: " + sainss);
		System.out.println("Desconto do IR �: " + sair);
		System.out.println("Acr�scimo de 5,75%: " + String.format("%.2f", sabl));
		System.out.println("Saldo bruto � de: " + salb);
		System.out.println("Saldo l�quido � de: " + salf);
		
	}

}
//c�digo pronto.
