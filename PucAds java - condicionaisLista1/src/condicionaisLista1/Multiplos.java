package condicionaisLista1;
import java.util.Scanner; 
public class Multiplos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero:");
		int Num = teclado.nextInt();
		
		if (Num % 3 == 0 && Num % 5 == 0 )
		{
			System.out.println("Numero multiplo de 3 e 5 ");
		}
		else 
			if (Num % 3 == 0 )
			{
				System.out.println(" ele e  multiplo somente de 3 ");
			}
			else
				if (Num % 5 == 0)
				{
					System.out.println(" ele e multiplo somente de 5 ");
				}
				else
				{
					System.out.println("Nao e multiplo 3 e nem 5 ");
				}
				
			
		

	}

}
