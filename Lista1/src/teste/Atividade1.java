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


// Execicio 1
// Fazer um programa para receber valores inteiros X, Y e Z do usuário e
// determinar se estes valores podem formar os lados de um triângulo. Em caso 
// afirmativo, informar se o triângulo é equilátero, isósceles ou escaleno
// Imprima o nome do triângulo formado
// Imprima mensagem de erro caso não seja possível formar o triângulo. 
// 
// A condição de existência de um triângulo é que a a soma de dois lados 
// é sempre menor que o terceiro lado.
// ou seja:   X + Y > Z
//            Y + Z > X
//            Y + Z > Y
//
// Equilátero todos os lados do mesmo tamanho: X = Y = Z
// Isóceles possui exatamente dois lados congruentes 
// ou seja: (x = y /= z) ou (y = z /= x) ou (x = z /= y)
// Escaleno possui todos os lados com medidas distintas
//            X /= Y /= Z





//public class exercicio1 {
	
	
//	public static void main(String[] args) {
//		System.out.println("Insira o valor inteiro de X: ");
//		int X = Integer.parseInt(System.console().readLine());  // Lê o número inteiro do usuário
//		
//		System.out.println("Insira o valor inteiro de Y: ");
//		int Y = Integer.parseInt(System.console().readLine());
		
//		System.out.println("Insira o valor inteiro de Z: ");
//		int Z = Integer.parseInt(System.console().readLine());
	
		
//		if (X + Y > Z && Y + Z > X && X + Z > Y) {
//            System.out.println("Estes Valores podem formar lados de um triângulo");
            
//            if (X == Y && Y == Z) {
//                System.out.println("Triângulo Equilátero");
//           } else if (X == Y || Y == Z || X == Z) {
//               System.out.println("Triângulo Isósceles");
//            } else {
//                System.out.println("Triângulo Escaleno");
//            }
//        } else {
//            System.out.println("Estes Valores não podem formar lados de um triângulo");
//       }
//        
//	 }
//	}
