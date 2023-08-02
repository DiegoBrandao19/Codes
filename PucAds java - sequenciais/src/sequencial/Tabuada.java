package sequencial;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.printf("%d x %d = %d\n", num, i, resultado);
        }
		

	}

}
