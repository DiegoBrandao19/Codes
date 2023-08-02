package repetiçao;
import java.util.Scanner;
public class Questao11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int sx =0;
		int resp = 0;
		 int conta = 1 ;
		int  qps = 0 ;
		int qpn = 0;
		double ppfs = 0 , ppmn = 0;
		int quantTotal = 6;
		for (conta =1; conta < quantTotal; conta++) {
			System.out.println("Digite o codigo do sexo (1 - f, 2 - m) ");
			sx = teclado.nextInt();
			System.out.println(" digite sua resposta (1 - S, 2 - N) ");
			resp = teclado.nextInt();
			
			 if (resp == 1)
			 {
				   qps++;
			 }
			 else
			 {
				  qpn++;
			 }
				 if(sx ==1 && resp ==1)
				 {
					 ppfs++;
				 }
				 else
				 {
					 ppmn++;
				 }
				 
		}
		        ppfs = (ppfs/quantTotal)*100;
		        ppmn = (ppmn/quantTotal)*100;
		        System.out.println("quantidade de pessoas sim= " + qps);
                System.out.println("quantidade de  pesssoas nao = " + qpn);
                System.out.println(" % de pessoas femininas que disse sim "+ ppfs);
                System.out.println("% de pessoas masculinas que disse sim " + ppmn);
	}

}
