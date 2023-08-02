package sequencial;
import java.util.Scanner;
public class Lojabicleta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Quantos empregados sao: ");
		int Num_empregados = teclado.nextInt();
		System.out.print("Qual e o valor do salario minimo: ");
		int Salario_minimo = teclado.nextInt();
		System.out.print("Qual e o valor total da(s) bicicletas: ");
		int Valor_bicicletas = teclado.nextInt();
		
		Double acresimo = Valor_bicicletas * 1.5;
		Double comissao = Valor_bicicletas * 0.15;
		Double Salario_total = Salario_minimo + comissao;
		Double Lucro_liquido = acresimo - comissao - Salario_total ;
		System.out.println("Salario do(s) empregado(s)sao: " + Salario_total);
		System.out.print("O lucro liquido da loja e de: " + acresimo);
		
		

	}

}
