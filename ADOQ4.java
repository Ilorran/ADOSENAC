package adoq4;
import java.util.Scanner;

public class ADOQ4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Gostaria de comprar um carro mas tem medo de ir cotar o pre�o por conta dos encargos?");
		System.out.println("Aqui voc� coloca o valor do carro no pre�o de f�brica e calcularemos o valor final, ok?");
		
		System.out.println("Agora digita para mim o valor do carro sem encargos: ");
		float valor = teclado.nextFloat();
		
		float valorf;
		
		valorf = ((0.28f * valor) + (0.45f * valor)) + valor;
		
		System.out.print("O valor total do carro � de R$: " + String.format("%.2f",valorf) );
	}

}
//c�digo pronto.
