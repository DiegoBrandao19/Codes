package condicionaisLista1;
import java.util.Scanner;
public class Num_maior20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int Num = teclado.nextInt();
		
		if (Num>20)
		{
			System.out.println("O seu numero e: "+ Num);
		}
		else
		{
			System.out.println(" Numero invalido para aparecer na tela ");
		}
				
			

	}

}
