package repetiçao;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		
		
		        Scanner input = new Scanner(System.in);

		        int cidade1 = input.nextInt();
		        int cidade2 = input.nextInt();

		        while (cidade1 != cidade2) {
		            int distancia = cidade2 - cidade1;

		            for (int velocidade = 20; velocidade <= 80; velocidade += 10) {
		                double tempo = distancia / (double) velocidade;
		                System.out.printf("Tempo para percorrer %d km a %d km/h: %.2f horas\n",
		                         distancia, velocidade, tempo);
		            }

		            
		        }
		        cidade1 = input.nextInt();
	            cidade2 = input.nextInt();
		     
		    }
		


	}


