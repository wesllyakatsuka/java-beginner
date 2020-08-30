import java.util.Scanner;

//Antes de submeter esse exercício na plataforma uri judge, mudar on-line o nome da classe para Main.
public class uri1016 {

	
	public static void main(String[] args) {
	
		int km, minutos = 2, tempo ;
		
		Scanner sc = new Scanner(System.in);
		
		km = sc.nextInt();
		tempo = km * minutos;
		
		System.out.println(tempo + " minutos");
		
		sc.close();
	}

}
