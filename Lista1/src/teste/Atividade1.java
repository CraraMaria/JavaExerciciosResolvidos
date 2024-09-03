// Receba do usuário via console uma sequência de números inteiros 
// até que 3 números pares sejam lidos
// Imprima quantas vezes o laço precisou ser repetido
// Use o Comando While
// ᓚᘏᗢ

package teste;

public class Atividade1 
{
	public static void main(String[] args) {
		int contarpares = 0;
		int contarinteracoes = 0;
		
		while (contarpares<3) {
		System.out.print("Digite um número inteiro:");
		int numero = Integer.parseInt(System.console().readLine());  // Lê o número inteiro do usuário 
		contarinteracoes++; //Incrementa o contador de iterações
		
		 if (numero % 2 == 0) { // verifica se o numero é par
		     contarpares++;
		 }
		 if (contarpares == 3) {
		 System.out.println("O laço foi repetido " + contarinteracoes + " vezes.");
		 }
		}
	}
}
