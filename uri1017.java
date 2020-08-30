import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1017 {

	public static void main(String[] args) {
		int horas, velocidade; 
		double litros, autonomia = 12.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		horas = sc.nextInt();
		velocidade = sc.nextInt();
		
		litros = (horas * velocidade) / autonomia;
		
		System.out.printf("%.3f%n", litros);
				
		sc.close();

	}

}
