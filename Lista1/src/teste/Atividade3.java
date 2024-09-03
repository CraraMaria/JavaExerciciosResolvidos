// Receba do usuário via console as variáveis m, x e n do tipo float e calcule o valor de y. 
// Equação reduzida da reta é y = mx + n
// Peça ao usuário uma variável por vez
// Todas as variáveis serão do tipo float. 

package teste;

public class Atividade3 {
	public static void main(String[] args) {
		
		System.out.print("Digite um número para m:");
		float m = Float.parseFloat(System.console().readLine());  // Lê o número float do usuário
		System.out.print("Digite um número para x:");
		float x = Float.parseFloat(System.console().readLine());
		System.out.print("Digite um número para n:");
		float n = Float.parseFloat(System.console().readLine());
		
		// calcule y = mx + n
		float y = m*x + n;
		
		System.out.print("O valor de y é: " + y);
			
	}
}
