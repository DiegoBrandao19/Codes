package repetiçao;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        boolean flag = true;
	        int contLucroMenor10 = 0;
	        int contLucroEntre10E20 = 0;
	        int contLucroMaior20 = 0;
	        
	        while (flag) {
	            System.out.print("Digite o nome da mercadoria (ou \"0\" para sair): ");
	            String nome = sc.nextLine();
	            
	            if (nome.equals("0")) {
	                flag = false;
	                continue;
	            }
	            
	            System.out.print("Digite o preço de compra da mercadoria: ");
	            double precoCompra = sc.nextDouble();
	            
	            System.out.print("Digite o preço de venda da mercadoria: ");
	            double precoVenda = sc.nextDouble();
	            sc.nextLine(); 
	            
	            double lucro = (precoVenda - precoCompra) / precoCompra * 100.0;
	            
	            if (lucro < 10.0) {
	                contLucroMenor10++;
	            } else if (lucro <= 20.0) {
	                contLucroEntre10E20++;
	            } else {
	                contLucroMaior20++;
	            }
	        }
	        
	        System.out.println("\nQuantidade de mercadorias com lucro inferior a 10%: " + contLucroMenor10);
	        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + contLucroEntre10E20);
	        System.out.println("Quantidade de mercadorias com lucro superior a 20%: " + contLucroMaior20);

	}

}
