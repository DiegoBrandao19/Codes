package sequencial;
import java.util.Scanner;
public class Descontos_Governo {

	public static void main(String[] args) {
	Scanner tc = new Scanner (System.in);
	
	System.out.println("Quanto R$(s) voce ganha por hora trabalhada: ");
	Double Valor_hr = tc.nextDouble();
	
	System.out.println("Quantas horas trabalhadas: ");
	Double Hrs_trabalhadas = tc.nextDouble();
	
	Double Salario_bruto = Valor_hr * Hrs_trabalhadas;
	System.out.println("O seu salario e: " + Salario_bruto);
	
	Double Imposto_renda = Salario_bruto * 0.11;
	System.out.println( "Voce pagara de imposto de renda: R$" +   Imposto_renda);
	
	Double INSS = Salario_bruto * 0.08;
	System.out.println("Voce pagara de INSS: R$" + INSS);
	
	Double Sindicato = Salario_bruto * 0.05;
	System.out.println("Voce pagara de sindicato: R$" + Sindicato);
	
    Double Descontos = Imposto_renda + INSS + Sindicato;
	Double Salario_liquido = Salario_bruto - Descontos ;
	System.out.println("O seu salario liquido e: R$" + Salario_liquido);
	
	
	
	
	
	
	}

}
