import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exerc�cio na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
		System.out.println("Impossivel calcular");
		}
		else {
		double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.printf("R1 = %.5f%n", r1);
		System.out.printf("R2 = %.5f%n", r2);
		}
		sc.close();
	}

}
