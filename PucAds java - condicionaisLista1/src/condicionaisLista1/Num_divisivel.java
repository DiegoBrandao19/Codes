package condicionaisLista1;
import java.util.Scanner;
public class Num_divisivel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero:");
		int A = teclado.nextInt();
		System.out.println("Digite um segundo numero:");
		int B = teclado.nextInt();
		
		if(A % B ==0)
		{
			System.out.println(A +" e divisivel " + B);
		}
		else
		{
			System.out.println("A nao e divisivel por B");
		}
				
	

	}

}
