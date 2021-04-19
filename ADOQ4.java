package adoq4;
import java.util.Scanner;

public class ADOQ4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Gostaria de comprar um carro mas tem medo de ir cotar o preço por conta dos encargos?");
		System.out.println("Aqui você coloca o valor do carro no preço de fábrica e calcularemos o valor final, ok?");
		
		System.out.println("Agora digita para mim o valor do carro sem encargos: ");
		float valor = teclado.nextFloat();
		
		float valorf;
		
		valorf = ((0.28f * valor) + (0.45f * valor)) + valor;
		
		System.out.print("O valor total do carro é de R$: " + String.format("%.2f",valorf) );
	}

}
//código pronto.
