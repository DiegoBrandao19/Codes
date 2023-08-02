package condicionaisLista1;
import java.util.Scanner;
public class adiçao_subtraçao {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	 System.out.println("Digite o primeiro numero:");
	 int Num = teclado.nextInt();
	 System.out.println("Digite o segundo numero");
	 int Num2 = teclado.nextInt();
	 int soma = Num + Num2;
	 
	 if(soma>=20)
	 {
		 System.out.println("A soma total e: " + (soma + 8));
	 }
	 else
		 if(soma<20)
		 {
			 System.out.println("A subtraçao e: " + (soma - 5));
		 }

	}

}
