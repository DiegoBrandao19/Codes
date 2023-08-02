package condicionaisLista1;
import java.util.Scanner;
public class Maior_Menor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite primeiro numero: ");
		int A = teclado.nextInt();
		System.out.println("Digite um segundo numero: ");
		int B = teclado.nextInt();
		
		if (A>B)
		{
			System.out.println(" A maior que B");
		}
		else
			if (B>A)
			{
				System.out.println("B maior A");
			}

	}

}
