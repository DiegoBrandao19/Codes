package sequencial;
import java.util.Scanner;
public class Anonasc {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int ano_nasc = teclado.nextInt();
		
		int ano = teclado.nextInt();
		
		int resultado_1 =  2030 - ano_nasc;
		
		int resultado_2 = ano - ano_nasc;
		System.out.println("A idade e " + resultado_2 + " ela tera em 2030 " + resultado_1);

	}

}
