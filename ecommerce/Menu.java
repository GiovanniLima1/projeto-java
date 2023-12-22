package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int escolha = 0, quantidade = 0;
		float total;
		String nomeLivro = "";
		
        Scanner leia = new Scanner(System.in);

        while (true) {
        	System.out.println("                                                     ");
			System.out.println("                LOJA DE LIVROS ONLINE                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
            System.out.println("                        Menu                         ");
            System.out.println("1 - Adicionar livro ao carrinho");
            System.out.println("2 - Calcular total");
            System.out.println("3 - Sair");
            
            
            System.out.print("Escolha uma opção: ");
            escolha = leia.nextInt();

			if (escolha == 3) {
				System.out.println("\nAgradecemos a preferência!");
				fim();
                 leia.close();
				System.exit(0);
			}

			switch (escolha) {
            case 1:
                System.out.print("Digite o nome do livro: ");
                nomeLivro = leia.nextLine().toLowerCase();
                System.out.print("Digite a quantidade desejada: ");
                quantidade = leia.nextInt();

  
                break;

            case 2:
                // Preciso criar o método na classe abstrata para fazer o calculo nessa opção
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    
      }
    
	}
		public static void fim() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Giovanni Henrique De Lima");
			System.out.println("https://github.com/GiovanniLima1/projeto-java");
			System.out.println("*********************************************************");
	}
}


