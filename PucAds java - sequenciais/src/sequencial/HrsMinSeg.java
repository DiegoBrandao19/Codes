package sequencial;
import java.util.Scanner;
public class HrsMinSeg {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Quanto segundos:");
		int segundos = teclado.nextInt();
		
		int horas = segundos/3600;
		int minutos = (segundos % 3600)/60;
		int segundos_restantes = segundos /60;
		String horas_formatadas = String.format("%02d:%02d:%02d", horas,minutos, segundos);
		System.out.print("o resultado e: " + horas_formatadas );
		
	


	}

}
