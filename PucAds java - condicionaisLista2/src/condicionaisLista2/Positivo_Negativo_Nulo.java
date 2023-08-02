package condicionaisLista2;
import java.util.Scanner;
public class Positivo_Negativo_Nulo {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		System.out.println("Digite um numero:");
		int Num = teclado.nextInt();
		
		if (Num>0)
		{
			System.out.println("Numero positivo");
		}
		else
			if(Num< 0)
			{
				System.out.println("Numero negativo");
			}
			else
			{
				System.out.println(" Numero nulo");
			}
	

	}

}
