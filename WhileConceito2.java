import java.util.Scanner;
import java.util.Locale;

public class WhileConceito2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double idade, somaIdade = 0.0, media = 0.0;
		int contador = 0;
		idade = sc.nextDouble();
		
		if(idade < 0) {
			System.out.println("impossivel calcular");
		}
		while(idade > 0) {
			somaIdade = somaIdade + idade;
			contador = contador + 1;
			media = somaIdade / contador;
			idade = sc.nextDouble();
				if(idade < 0) {
					System.out.printf("%.2f%n", media);
				}		
		}	
		sc.close();
		}		
}
