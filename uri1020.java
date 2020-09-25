import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, quociente, ano, mes, dia, resto;
		
		n = sc.nextInt();
		
		resto = n;
		
		ano = 365;
		quociente = resto / ano;
		System.out.println(quociente + " ano(s)");
		resto = resto % ano;
		
		mes = 30;
		quociente = resto / mes;
		System.out.println(quociente + " mes(es)");
		resto = resto % mes;
		
		dia = 1;
		quociente = resto / dia;
		System.out.println(quociente + " dia(s)");
		
		sc.close();
		
	}

}
