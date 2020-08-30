import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1011 {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double volume = (4.0/3) * 3.14159 * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
