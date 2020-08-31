import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, horas, minutos, segundos, resto;
		
		n = sc.nextInt();
		
		horas = n / 3600;
		resto = n % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

	}

}
