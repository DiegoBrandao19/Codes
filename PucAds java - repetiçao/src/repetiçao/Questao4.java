package repetiçao;
import java.util.Scanner;
public class Questao4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int idade = 0;
		int soma = 0 ;
		int qtd = 0;
		int MaiorIdade = 0;
		
		while (idade!= -1)
		{
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		}
			if(idade != -1)
			{	
				soma = idade;
				qtd++;
			}
			
			if (idade > MaiorIdade)
			{    
				 MaiorIdade = idade;
			}
			
			if (qtd > 0)
			{
				double media = soma/ qtd;
				 System.out.println("Média de idade: " + media);
		         System.out.println("Maior idade: " + MaiorIdade);
			}
			else
			{
				 System.out.println("Nenhuma idade foi informada.");
			}
	}
}
