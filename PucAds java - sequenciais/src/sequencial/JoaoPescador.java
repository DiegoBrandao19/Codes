package sequencial;
import java.util.Scanner; 
public class JoaoPescador {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
    System.out.print("Digite o peso dos peixes em quilos: ");
    double peso = teclado.nextDouble();
    
    double excesso = peso - 50.0; 
    double multa = 0.0; 
    
    if (excesso > 0.0) {
        multa = excesso * 4.0;
        System.out.printf("O peso excedeu o limite em %.2f kg. A multa a ser paga é de R$ %.2f.%n", excesso, multa);
    } else {
        System.out.println("O peso está dentro do limite estabelecido. Não há multa a ser paga.");
    }
    
  
}
	
}
