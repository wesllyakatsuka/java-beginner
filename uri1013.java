import java.util.Scanner;

//Antes de submeter esse exerc�cio na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a, b, c, x, y;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		x = (a + b + Math.abs(a - b)) / 2;

		y = (x + c + Math.abs(x - c)) / 2;

		System.out.println(y + " eh o maior");

		sc.close();

	}

}
