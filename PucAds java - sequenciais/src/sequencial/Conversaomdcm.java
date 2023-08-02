package sequencial;
import java.util.Scanner;
public class Conversaomdcm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Double metros = teclado.nextDouble();
		System.out.println("MEDIDAS:");
		Double decimetros = metros * 10;
		Double centimetros = decimetros * 10;
		Double milimetros = centimetros *10;
		System.out.println("valor em  metros: " + metros);
		System.out.println("valor em decimetros: "+ decimetros);
		System.out.println("valor em centimetros: " + centimetros);
		System.out.println("valor em milimetros " + milimetros);
	

	}

}

