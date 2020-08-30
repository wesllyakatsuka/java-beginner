import java.util.Locale;
import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		
		 a = sc.nextDouble();
		 b = sc.nextDouble();
		
		media = ((a * 3.5) + (b * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}
