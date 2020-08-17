import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

/*
		 * double x = 10.35784;
		 * 
		 * System.out.println(x);
		 * 
		 * //Exibe o valor armazenado na variável x com vírgula porque meu sistema é em
		 * Português. System.out.printf("%.2f%n", x);
		 * 
		 * //Exibe o valor armazenado na variável x com ponto e 2 casas após o ponto ao
		 * invés de vírgula porque utiliza o método Locale Locale.setDefault(Locale.US);
		 * System.out.printf("%.2f%n", x);
		 * 
		 * //concatenação com println System.out.println("RESULTADO = " + x +
		 * " METROS");
		 * 
		 * //outra forma de concatenar com printf
		 * System.out.printf("RESULTADO = %.2f metros%n", x);
		 * 
		 * String nome = "Maria"; int idade = 31; double renda = 4000.0; //concatenação
		 * de acordo com os seguintes parâmetros: "%d = inteiro", "%s = texto",
		 * "%n = quebra de linha"
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,
		 * renda);
*/
		
		
/*
		//Concatenação e formatação de saída de dados.

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
*/
		
		//Entrada de dados
		Locale.setDefault(Locale.US); //Locale configura o PC do usuário para o padrão americano com ponto.
		Scanner sc = new Scanner(System.in); //Variável sc do tipo Scanner recebe o que for digitado
/*		
		//Armazenando na variável x que é do tipo String o que for digitado no teclado.
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		//Armazenando na variável y que é do tipo int o que for digitado no teclado.
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		//Armazenando na variável z que é do tipo double o que for digitado no teclado.
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		//Armazenando na variável d que é do tipo char o que for digitado no teclado.
		char d;
		d = sc.next().charAt(0);
		System.out.println("Você digitou: " + d);
*/
/*
		//Funções matemáticas
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
*/		
		double largura, comprimento, area, valorM2, valorTotal;
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorM2 = sc.nextDouble();
		
		area = largura * comprimento;
		valorTotal = area * valorM2;
		
		System.out.printf("AREA = %.2f%n", area);			
		System.out.printf("PRECO = %.2f%n" ,  valorTotal);
	
		
		//Encerra o objeto 
		sc.close();
	
	}

}
