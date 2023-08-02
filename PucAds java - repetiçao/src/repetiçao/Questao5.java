package repetiçao;
import java.util.Scanner;
public class Questao5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int sx = 0;
		double maiorAltGrupo = 0,menorAltGrupo = 0, Alt = 0;
		double media =0, quantM =0,somaAltM =0,quantH =0, porcM=0;
		
		System.out.println("informe o cdigo do sexo");
		 sx = teclado.nextInt();
		 
		 while (sx !=0) {
		 
			 System.out.println("Informe a altura");
			 Alt = teclado.nextDouble();
		 if (sx==1)
		 {
			 quantM++;
			 somaAltM = somaAltM + Alt;
			 media = somaAltM/quantM;
			 
		 }
		 else
		 {
			 quantH++;
		 }
		 if(Alt>maiorAltGrupo)
		 {
			 maiorAltGrupo = Alt;
		 }
		 if(Alt<menorAltGrupo)
		 {
			 menorAltGrupo = Alt;
		 }
		 System.out.println("informe o codigo sexo (1 = f , 2= masc)");
		 sx = teclado.nextInt();
		}
		 System.out.println("");
		 
		 
	

		 
		 
		 
	}
	
}