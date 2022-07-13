import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		boolean ex0 = false;
		boolean ex1 = false;
		boolean ex2 = false;
		boolean ex3 = false;
		boolean ex4 = false;
		boolean ex5 = false;
		boolean ex6 = true;
		
		Scanner scan = new Scanner(System.in);
		
		//Exemplo 0 - Hello World
		if(ex0) {
			System.out.println("Hello World!");
		}
		
		//Exemplo 1 - Leitor de nome e idade
		if(ex1) {
			System.out.println("Leitor de nome e idade:");
			System.out.println("Ao digitar 0 no nome, o programa encerra!");
				
			String nome;
			int idade;
			
			while(true) {
				
				System.out.println("Nome:");
				nome = scan.next();
				
				if(nome.equals("0")) {
					break;
				}
				
				System.out.println("Idade:");
				idade = scan.nextInt();
			}
			
			System.out.println("Fim do Programa Nome e Idade");
		}
		
		//Exemplo 2 - Aceita apenas nota entre 0 e 10
		if(ex2) {		
			int nota;
			
			System.out.println("Digite uma nota entre 0 e 10!");
			System.out.println("Nota:");
			nota = scan.nextInt();
			
			while(nota < 0 || nota > 10) {
				System.out.println("Nota Inv�lida!");
				System.out.println("Nota:");
				nota = scan.nextInt();
			}
			System.out.println("A nota � " + nota);
		}
		
		//Exemplo 3 - M�dia e Maior
		if(ex3) {		
			int contador = 0;
			float soma = 0f, n = 0, maior = n;
			
			System.out.println("O programa precisa de 5 n�meros para dizer a m�dia e o maior deles!");
			do{
				System.out.println("Digite um n�mero:");
				n = scan.nextInt();
				if(contador == 0 || n > maior) maior = n;	
				soma = soma + n;
				contador++;			
			}while(contador < 5);
			
			System.out.println("O maior � " + maior);
			System.out.println("A m�dia � " + soma/5);

		}
		
		//Exemplo 4 - Pares e Impares
		if(ex4) {
			System.out.println("Quantos n�meros s�o Pares e �mpares em N inteiros:");
			int par = 0, impar = 0;
			
			System.out.println("Digite a quantidade:");
			int quantidade = 0;
			quantidade  = scan.nextInt();
			while(quantidade<=0) {
				System.out.println("Digite uma quantidade maior que zero:");
				quantidade  = scan.nextInt();
			}
			
			int contador = 0;
			int numero;
			do {
				System.out.println("Digite um n�mero:");
				numero  = scan.nextInt();
				if( numero%2 == 0 ) {
					par++;
				}else {
					impar++;					
				}
				contador++;
				
			}while(contador < quantidade);
		
			System.out.println("Pares: " + par );
			System.out.println("�mpares: " + impar );
		}
		
		//Exemplo 5 - Tabuada
		if(ex5) {
			System.out.println("Tabuada:");
			int numero = 0;
			System.out.println("Digite um n�mero de 1 a 10:");
			numero  = scan.nextInt();
			while(numero < 1 || numero > 10) {
				System.out.println("iNV�LIDO! Digite um n�mero de 1 a 10:");
				numero  = scan.nextInt();
			}
			System.out.println("Tabuada de " + numero);
			for(int i = 0; i <= 10 ; i++ ) {
				System.out.println( numero + " X " + i + " = " + (numero*i) );
			}
		}
		
		//Exemplo 6 - Fatorial
		if(ex6) {
			System.out.println("Fatorial:");
			int numero = 0;
			System.out.println("Digite um n�mero maior que 0:");
			numero  = scan.nextInt();
			while(numero < 1) {
				System.out.println("iNV�LIDO! Digite um n�mero maior que 0:");
				numero  = scan.nextInt();
			}
			System.out.println("Fatorial de " + numero);
			int fatorial = 1;
			for(int i = numero; i >= 1 ; i-- ) {
				fatorial = fatorial * i;
			}
			System.out.println( numero + "! = " + fatorial);
		}
		
		scan.close();
			
	}
}