package condicionaisLista2;
import java.util.Scanner;
public class Soma_de_2numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int NumA = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		int NumB = teclado.nextInt();
		
		int soma = NumA + NumB;
		
		if(soma>=10)
		{
			System.out.println("Soma e: " + soma);
		}
		else
		{
			System.out.println("erro");
		}
	}

}
