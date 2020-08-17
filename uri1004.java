import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1004 {

	public static void main(String[] args) {
	
		int a, b, prod;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		prod = a * b;
		
		System.out.println("PROD = " + prod);
		
		sc.close();

	}

}
