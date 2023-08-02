package repetiçao;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    
		int cc= 0;
		while(cc>=0){
			System.out.println(" Qual e o canal da casa:");
			int canalCasa = sc.nextInt();
			if(canalCasa<4&& canalCasa<5 && canalCasa<7&& canalCasa<12) {
				System.out.println("Canais invalidos");
				
			}
			
		}
	}

}
