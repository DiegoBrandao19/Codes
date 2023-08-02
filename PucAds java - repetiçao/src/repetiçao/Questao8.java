package repetiçao;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Massa inicial em gramas: ");
	        double massaInicial = sc.nextDouble();
	       
	        
	        int tempo = 0;
	        while (massaInicial >= 0.5) {
	            massaInicial /= 2;
	            tempo += 50;
	        }
	        
	        int horas = tempo / 3600;
	        int minutos = (tempo % 3600) / 60;
	        int segundos = tempo % 60;
	        
	        System.out.println("Massa inicial: " + massaInicial + " g");
	        System.out.println("Tempo necessário: " + horas + "h " + minutos + "min " + segundos + "s");
	    }

	}


