package condicionaisLista2;
import java.util.Scanner;
public class idade_Eleitoral {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite sua idade:");
		int idade = teclado.nextInt();
		if(idade<16)
		 {
                    System.out.print("Nao tem idade para votar");
		 }
		else
		     if(idade>16 || idade<60)
		     {
			System.out.print("Idade obrigatoria a votar");     
		     }
		else
		     {
			System.out.print("Nao e obrigatorio votar");
		     }
	}

}
