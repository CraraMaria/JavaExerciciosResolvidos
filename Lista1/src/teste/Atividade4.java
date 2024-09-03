// Receba do usuário via console dez números inteiros 
// e ache qual o menor e o maior número informado 
// Imprima o maior número encontrado
// Imprima o menor número encontrado
// Use o comando while
// Crie duas variáveis auxiliares para armazenar o menor e o maior valor encontrado

package teste;

public class Atividade4 {
	public static void main(String[] args) {
		int contador = 0;
        int maior = Integer.MIN_VALUE;  // Inicializa com o menor valor possível para garantir que qualquer número informado será maior
        int menor = Integer.MAX_VALUE;  // Inicializa com o maior valor possível para garantir que qualquer número informado será menor

        while (contador < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(System.console().readLine());  // Lê o número inteiro do usuário
            
            if (numero > maior) {  // Verifica se o número atual é o maior
                maior = numero;
            }
            
            if (numero < menor) {  // Verifica se o número atual é o menor
                menor = numero;
            }
            
            contador++;  // Incrementa o contador
        }
        
        // Exibe os resultados
        System.out.println("O maior número encontrado foi: " + maior);
        System.out.println("O menor número encontrado foi: " + menor);
    }
}
