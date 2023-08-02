package repetiçao;

public class Questoa7 {

	public static void main(String[] args) {
		int populaçaoA = 90000;
		int populaçaoB = 200000;
		double taxacrescimentoA = 0.03;
		double taxacrescimentoB = 0.015;
		
		 int anos = 0;
		 while(populaçaoA < populaçaoB)
		 {
			 populaçaoA += (int) (populaçaoA * taxacrescimentoA);
	         populaçaoB += (int) (populaçaoB * taxacrescimentoB);
	         anos++;
		 }
		 System.out.println("Levará " + anos + " anos para a população da cidade A ultrapassar ou se igualar à população da cidade B.");

	}

}
