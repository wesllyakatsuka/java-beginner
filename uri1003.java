import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1003 {

	public static void main(String[] args) {
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);	
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
