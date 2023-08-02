package repetiçao;

public class Questao2 {

	public static void main(String[] args) {
		int x = 6 ;
		int soma = 0; 
		
		while(x<=32)
		{
			soma = soma + x;
			x = x + 2;
		}
		System.out.println("Soma =  " + soma);
	}

}
