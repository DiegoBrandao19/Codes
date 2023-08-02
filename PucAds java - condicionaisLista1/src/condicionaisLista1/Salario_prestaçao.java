package condicionaisLista1;
import java.util.Scanner;
public class Salario_prestaçao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Qual e o valor do salario bruto:  ");
		Double Salario = teclado.nextDouble();
		System.out.println("Qual e o valor da prestçao: ");
		Double Prestaçao = teclado.nextDouble();
		
		 if(Prestaçao <= (Salario*0.3))
		 {
			 System.out.println("Emprestimo concedido");
		 }
		 else
		 {
			 System.out.println("Emprestimo nao concedido ");
		 }
	}

}
