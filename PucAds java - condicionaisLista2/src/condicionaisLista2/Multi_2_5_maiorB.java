package condicionaisLista2;
import java.util.Scanner;
public class Multi_2_5_maiorB {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int A = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		int B = teclado.nextInt();
		
		if(A % 2 == 0 && A % 5 == 0 && A>B)
		{
			System.out.println(A + " e multiplo de 2 e multiplo de 5 e e maior que" + B );
		}
		else
		{
			System.out.println(A + " nao e multiplo de 2 e  e nem multiplo de 5 e  nao e maior que " + B);
		}
	}

}
