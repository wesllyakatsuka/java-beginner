import java.util.Scanner;
import java.util.Locale;
//Programa encerra quando é digitado o número 0 e exibe a soma de todos os números digitados anteriormente.
public class WhileConceito {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n, soma = 0;
	
	n = sc.nextInt();
	
	while(n != 0) {
		soma = soma + n;
		n = sc.nextInt();
	}
	System.out.println(soma);
	
	sc.close();
	}

}
 