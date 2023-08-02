package sequencial;
import java.util.Scanner; 
public class Loja_Tintas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = input.nextDouble();
        double tintaNecessaria = area / 6 * 1.1;
        int latas = (int) Math.ceil(tintaNecessaria / 18);
        double precoLatas = latas * 80.0;
        int galoes = (int) Math.ceil(tintaNecessaria / 3.6);
        double precoGaloes = galoes * 25.0;
        int latasMinimizado = (int) (tintaNecessaria / 18);
        int galoesMinimizado = (int) Math.ceil((tintaNecessaria % 18) / 3.6);
        double precoLatasGaloes = (latasMinimizado * 80.0) + (galoesMinimizado * 25.0);
        System.out.println("Quantidade de tinta necessária: " + tintaNecessaria + " litros");
        System.out.println();
        System.out.println("Opção A - Comprar apenas latas de 18 litros:");
        System.out.println("Quantidade de latas necessárias: " + latas);
        System.out.println("Preço total das latas: R$ " + precoLatas);
        System.out.println();
        System.out.println("Opção B - Comprar apenas galões de 3,6 litros:");
        System.out.println("Quantidade de galões necessários: " + galoes);
        System.out.println("Preço total dos galões: R$ " + precoGaloes);
        System.out.println();
        System.out.println("Opção C - Combinar latas e galões para minimizar o desperdício de tinta:");
        System.out.println("Quantidade de latas necessárias: " + latasMinimizado);
        System.out.println("Quantidade de galões necessários: " + galoesMinimizado);
        System.out.println("Preço total das latas e galões: R$ " + precoLatasGaloes);

}
}	


