// Receba do usuário via console uma sequência de números inteiros até que
// 5 números ímpares sejam lidos. 
// Imprima o primeiro número ímpar lido
// Imprima o último número ímpar lido.
// Imprima quantas vezes o laço precisou ser repetido. 
// Use o comando while
// Crie duas variáveis auxiliares para armazenar o primeiro e o último valor ímpar encontrado. 
package teste;

public class Atividade2 {
	
	public static void main(String[] args) {
		int contarimpares = 0;
		int contarinteracoes = 0;
		int primeiroimpar = 0;
		int ultimoimpar = 0;
		
		while (contarimpares<5) {
			System.out.print("Digite um número inteiro:");
			int numero = Integer.parseInt(System.console().readLine());  // Lê o número inteiro do usuário 
			contarinteracoes++; //Incrementa o contador de iterações
			
			 if (numero % 2 != 0) { // verifica se o numero é impar
			    if (contarimpares == 0) { // Se for o primeiro ímpar encontrado
			    	primeiroimpar = numero;
			    }
				 ultimoimpar = numero; // Atualiza o último número ímpar encontrado
				 contarimpares++;
			 }
			 if (contarimpares == 5) {
				 
			 System.out.println("Primeiro número ímpar lido: " + primeiroimpar);
			 System.out.println("Último número ímpar lido: " + ultimoimpar);
			 System.out.println("O laço foi repetido " + contarinteracoes + " vezes.");
			 }
		
	
	}
}
}