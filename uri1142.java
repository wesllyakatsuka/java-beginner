import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n, inicio = 1, segundo, terceiro;
		
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			segundo = inicio + 1;
			terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);

			inicio = inicio + 4;
		}
		
		sc.close();

	}

}				
