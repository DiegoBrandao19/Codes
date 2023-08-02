package sequencial;
import java.util.Scanner;
public class TaxiCalculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Situaçao odometro inicial: ");
		int odometro_inicial = teclado.nextInt();
		System.out.print("Situaçao odometro final: ");
		int odometro_final = teclado.nextInt();
		System.out.print("Situaçao km rodados: ");
		int km_rodados = teclado.nextInt();
		System.out.print("Situaçao litros de combustivel: ");
		int litros_combustivel = teclado.nextInt();
		System.out.print("Valor da corrida: ");
		int valor_corrida = teclado.nextInt();
		
		int consumo = km_rodados / litros_combustivel;
		double calculo_gasolina = litros_combustivel * 1.72;
		double calculo_odometro = (odometro_inicial + odometro_final) /litros_combustivel;
		double lucro_liquido = valor_corrida - calculo_gasolina  - consumo;
		System.out.println("O consumo de gasolina e: " + consumo);
		System.out.println("lucro liquido do taxista: " + lucro_liquido);
		
		
		
	}

}
