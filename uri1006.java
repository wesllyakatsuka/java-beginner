import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exerc�cio na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = ((a * 2) + (b * 3) + (c * 5)) / 10.0;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();

	}

}
