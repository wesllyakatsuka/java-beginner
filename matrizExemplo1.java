import java.util.Scanner;

public class matrizExemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();			
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
