package repetiçao;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int Num =0;
		int Qp = 0;
		int M3 = 0;
		int quant = 5;
	    double Qm5 = 0 ;
		int contador = 1;
		
		while (contador <=quant)
		{
		System.out.println("informe um numero: ");
		Num = teclado.nextInt();
		if (Num % 2 == 0) {
		Qp = Qp + 1;
		}
		if (Num % 3 ==0) {
			M3 = M3 +1;
			
		}
		if (Num % 5==0) {
			Qm5 = Qm5 +1;
		}
		contador = contador + 1;
		}
		System.out.println("Numeros pares: " + Qp);
		System.out.println("Numero divisiveis " + M3);
		System.out.println("Porcentagem de numeros divisiveis por 5: " +Qm5/quant *100);
		
	}

}
