package adoq5;
import java.util.Scanner;

public class ADOQ5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos debrulhar seu salário para vermos seus encargos");
		System.out.print("Digite o seu salário bruto: ");
		float salb = teclado.nextFloat();
		
		float salf, sainss, sair, sabl;
		
		sainss = (0.08f * salb);
		
		sair = (0.15f * salb);
		
		salf = (salb - (sair + sainss));
		
		sabl = (0.0575f * salf);
		
		salf = sabl + salf;
		
		System.out.println("Desconto do INSS é: " + sainss);
		System.out.println("Desconto do IR é: " + sair);
		System.out.println("Acréscimo de 5,75%: " + String.format("%.2f", sabl));
		System.out.println("Saldo bruto é de: " + salb);
		System.out.println("Saldo líquido é de: " + salf);
		
	}

}
//código pronto.
