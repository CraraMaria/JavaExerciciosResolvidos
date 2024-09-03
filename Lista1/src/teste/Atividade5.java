// Um pequeno produtor rural quer vender dois bois para abate, pois precisa fazer receita e 
// pagar suas despesas mensais. O seu funcionário selecionou 10 animais para serem 
// pesados na esperança de que nesse grupo tenham dois animais ideiais para serem abatidos.
// Caso dois animais em condições ideias sejam encontrados, calcule a receita que o
// produtor irá obter com a sua venda. Caso contrário, informe ao produtor que um novo 
// grupo de animais precisa ser selecionado para o processo de pesagem

//  O valor da arroba do boi está cotado hoje em R$ 232,60. 
//  Arroba: medida que representa o peso da carcaça do boi.
//  Peso ideal do boi para abate >= 600 quilos
//	Cálculo da receita = Quantidade x Preço. 
//	Imprima na console o valor da receita. Imprima na console o valor da receita. 
//	Imprima na console quantos bois foram pesados.
//	Informe ao usuário se o processo teve sucesso ou não.Informe ao usuário se o processo teve sucesso ou não.

// Receba do usuário via console os dados de cinco bois

package teste;

public class Atividade5 {
	public static void main(String[] args) {
		final double precoarroba = 232.60;  // final = constante 
		final int pesoideal = 600;          // constante
		int quantidadedeboispesados = 0;
		int quantidadedeboisaptos = 0;
		double receita = 0;
		
		double[] pesos = new double[5];  // Array para armazenar os pesos dos bois	
		while (quantidadedeboispesados < 5) {  // Laço que vai até que 5 bois sejam pesados
			System.out.print("Digite o peso do boi " + (quantidadedeboispesados + 1) + " em quilos: ");
			double peso = Double.parseDouble(System.console().readLine());  // Lê o peso do boi
			
		    pesos[quantidadedeboispesados] = peso;  // Armazena o peso no array
		    quantidadedeboispesados++;  // Incrementa o contador de bois pesados
		 // Verifica se o boi está apto para abate
		    if (peso >= pesoideal) {
		    	quantidadedeboisaptos++;  // Incrementa o contador de bois aptos
		        receita += peso / 15 * precoarroba;  // Calcula a receita gerada por este boi
		    }
		    // Se já tiver pesado 10 bois, termina a pesagem
		    if (quantidadedeboispesados == 10) {
		        break;  // Sai do laço depois de pesar todos os 10 bois
		    }
	    }	
		 // Imprime o resultado
		
		switch (quantidadedeboisaptos) {
        case 0:
            System.out.println("Não foram encontrados bois suficientes para abate. Novo grupo precisa ser pesado.");
            break;
        case 1:
            System.out.println("Apenas um boi foi encontrado apto para abate.");
            System.out.println("Receita obtida com a venda do boi apto: R$ " + receita);
            break;
        default:
            System.out.println(quantidadedeboisaptos + " bois foram encontrados aptos para abate.");
            System.out.println("Receita obtida com a venda dos bois aptos: R$ " + receita);
            break;
        }
		System.out.println("Quantidade de bois pesados: " + quantidadedeboispesados);
	}
}

