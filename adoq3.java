package adoq3;
import java.util.Scanner;

public class adoq3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calcular volume de uma esf�ra/cilindro:");
		System.out.println("Primeiro precisamos de algumas informa��es, vou pedir algumas abaixo ok?");
		System.out.print("Preciso que me informe o raio do cilindro/esf�ra: ");
		
		double raio = teclado.nextFloat();
		double raiof;
		
		raiof = (4 * 3.14  * (raio * raio * raio))/3;
		
		System.out.print("O volume da esf�ra �: " + String.format("%.2f", raiof));
	}

}
