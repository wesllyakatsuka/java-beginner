import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar o nome da classe para Main.
public class uri1001 {

		public static void main(String[] args) {
			int A, B, X;
			
			Scanner sc = new Scanner(System.in);
			A = sc.nextInt();
			B = sc.nextInt();
			
			X = A + B;
			
			System.out.println("X = " + X);
			
			sc.close();

		}

	}