package condicionaisLista2;
import java.util.Scanner;
public class Nota_Aluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		 System.out.println("Digite nota 1: ");
		 Double Nota_1 = teclado.nextDouble();
		 System.out.println("Digite nota 2: ");
		 Double Nota_2 = teclado.nextDouble();
		 System.out.println("Digite nota 3: ");
		 Double Nota_3 = teclado.nextDouble();
		 
		 Double Media = (Nota_1 + Nota_2 + Nota_3)/3;
		 System.out.println("Media do aluno: " + Media);
		 if(Media<2 )
		 {
			 System.out.println("Aluno com nota RUIM");
		 }
		 else
			 if(Media>=2 && Media< 4)
			 {
				 System.out.println("Aluno com nota FRACA");
			 }
			 else
				 if (Media >= 4 && Media< 5.5)
				 {
					 System.out.println("Aluno com nota REGULAR");
				 }
				 else
					 if(Media >= 5.5 && Media < 7.5)
					 {
						 System.out.println("Aluno com nota BOA");
					 }
					 else
					 {
						 System.out.println("Aluno com nota  MUITO BOA");
					 }
				 
		

	}

}
