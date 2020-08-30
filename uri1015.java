import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exerc�cio na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia, x1, x2, y1, y2;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		

		distancia = Math.sqrt( Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0) );
		
		System.out.printf("%.4f%n", distancia);
		
		sc.close();

	}

}
