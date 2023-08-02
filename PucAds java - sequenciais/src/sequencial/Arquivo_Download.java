package sequencial;
import java.util.Scanner;
public class Arquivo_Download {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = input.nextDouble();
        System.out.print("Digite a velocidade da conexão em Mbps: ");
        double velocidadeConexao = input.nextDouble();
        double tempoDownload = (tamanhoArquivo * 8) / (velocidadeConexao * 60);
        System.out.printf("Tempo aproximado de download: %.2f minutos", tempoDownload);
		

	}

}
