package repetiçao;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        System.out.print("Informe o salário fixo: ");
        double salarioFixo = sc.nextDouble();

        
        for (int i = 1; i <= 2; i++) {
            System.out.println("\nVendedor " + i);

           
            System.out.print("Informe o número de televisores tipo 1 vendidos: ");
            int tv1Vendidas = sc.nextInt();

            
            System.out.print("Informe o número de televisores tipo 2 vendidos: ");
            int tv2Vendidas = sc.nextInt();

           
            double comissao = 0;
            if (tv1Vendidas >= 10) {
                comissao += tv1Vendidas * 120;
            } else {
                comissao += tv1Vendidas * 50;
            }
            if (tv2Vendidas >= 20) {
                comissao += tv2Vendidas * 80;
            } else {
                comissao += tv2Vendidas * 30;
            }

            
            double salarioBruto = salarioFixo + comissao;
            double inss = salarioFixo * 0.08;
            double salarioLiquido = salarioBruto - inss;
            if (salarioLiquido >= 1200) {
                double irrf = salarioLiquido * 0.15;
                salarioLiquido -= irrf;
            }

            System.out.println("Número de inscrição: " + i);
			System.out.println("Salário bruto: R$" + salarioBruto);
            System.out.println("Salário líquido: R$" + salarioLiquido);
            
        }
        
		

	}

}
