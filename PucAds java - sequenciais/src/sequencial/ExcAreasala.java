package sequencial;
import java.util.Scanner;
public class ExcAreasala {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		Double comprimento_cozinha = teclado.nextDouble();	
		Double largura_cozinha =  teclado.nextDouble();
		Double altura_cozinha = teclado.nextDouble();
		Double parede1 = comprimento_cozinha * altura_cozinha;
		Double parede2 = largura_cozinha * altura_cozinha;
		Double tetopiso = comprimento_cozinha * largura_cozinha;
		double areaTotal = parede1 * 2 + parede2 * 2 + tetopiso *2;
		double azuleijos = areaTotal / 1.5;
		System.out.print("Area ocupadas pelo azulejo sao " + String.format("%.5f", azuleijos));
		
	}

}
