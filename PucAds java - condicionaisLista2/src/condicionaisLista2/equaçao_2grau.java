package condicionaisLista2;

import java.util.Scanner;

public class equaçao_2grau {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		double delta  = b*b - 4*a*c;
		double x1 = 0, x2 = 0;
		
		if (delta>=0)
		{
			x1 = (-b - Math.sqrt(delta))/(2*a);
			x2 = (- b + Math.sqrt(delta))/(2*a);
			System.out.println("Raizes = " + x1 + " e " + x2);
		}
		else
		{
			System.out.println("Não sao raizes");
		}

	}

}
