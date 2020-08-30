import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		Double pisoSalarial, vendas, comissao, total;
		
		nome = sc.next();
		pisoSalarial = sc.nextDouble();
		vendas = sc.nextDouble();
		
		comissao = vendas * 0.15;
		total = pisoSalarial + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();

	}

}
