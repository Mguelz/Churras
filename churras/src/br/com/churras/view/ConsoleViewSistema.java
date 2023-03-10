package br.com.churras.view;

import java.util.Scanner;

import br.com.churras.model.Item;
import br.com.churras.service.ItensChurrasService;

/**
 * 
 * 
 * @author Matheus Martins
 * @author Miguel Arcanjo
 * @author Bruno Polido
 *
 */
public class ConsoleViewSistema {

	public void inicializacaoSistema(ItensChurrasService item) {
		selecao();
//		item.preCadastroItensBase();
//		itensCadastrados(item);
//		menuOpcoes();
	}

	public void informacao() {
		System.out.println("------------- APRESENTAÇÂO DO SISTEMA E COMO USAR -------------");
		System.out.println("De acordo com a pesquisa feita cada pessoa em um churrasco consome 450g de carne");
		System.out.println("1.5l de refrigerante ou 5 latas de 330ml");
		System.out.println("Com base nesses dados fizemos um sistema para calcular o valor total do churrasco");
		System.out.println("e valor que cada pessoa vai precisar pagar");
		System.out.println("Tendo em Base que o valor dos itens para o churasco e de de");
		System.out.println("--------------- =============================== ---------------");
		System.out.println("");

	}

	/**
	 * TODO REFATORAR OPÇÕES DO MENU
	 * 
	 * A tela deverá iniciar com informações mais simples, por exemplo: ( 1 -
	 * Cadastrar ( 1 - Itens (dentro de convidados) 2 - Convidados (dentro de
	 * convidados) ) 2 - Visualizar ( 1 - Itens (dentro de convidados) 2 -
	 * Convidados (dentro de convidados) ) 3 - Calcular 4 - Como usar o programa )
	 * Assim em sequencia, por exemplo, digitou 1 (Cadastrar), entrar na área de
	 * cadastro mostrando em 3 opções o que a pessoa quer cadastrar (carne, refri ou
	 * cerveja).
	 * 
	 * Nas opções Itens ou Convidados, ter três opções para seleção do usuário, a
	 * primeira de visualizar, a segunda de remover apenas um e a última de limpas a
	 * lista.
	 * 
	 * @author Miguel Arcanjo
	 * 
	 */

	public void itensCadastrados(ItensChurrasService item) {
		System.out.println("------------- Itens cadastrados -------------");
		if (!item.getMapa().isEmpty()) {
			System.out.println("Carnes: ");
			for (Item cada : item.getMapa().get("carne")) {
				System.out.println("	" + cada.getNome() + " R$" + cada.getValor());
			}
			System.out.println("Refrigerantes: ");
			for (Item cada : item.getMapa().get("refrigerante")) {
				System.out.println("	" + cada.getNome() + " R$" + cada.getValor());
			}
			System.out.println("Cervejas: ");
			for (Item cada : item.getMapa().get("cerveja")) {
				System.out.println("	" + cada.getNome() + " R$" + cada.getValor());
			}
		}
		System.out.println("------------- ============================= -------------");
	}

	public void menuOpcoes() {
		System.out.println("\n------------- Tela Inicial -------------");
		System.out.println("\n  1 - Cadastrar \n  2 - Visualizar \n  3 - Calcular Valor por Pessoa \n  4 - Como Usar o Sistema \n  0 - Sair");
	}

	public void selecao() {
		// OBJETOS
		Scanner scanner = new Scanner(System.in);

		// VARIAVEIS
		int escolhaUsuario = 0;
		int continuarLoop = 1;

		do {
			menuOpcoes();
			escolhaUsuario = scanner.nextInt();

			switch (escolhaUsuario) {
			case 1: {
				int continuarCadastro = 0;
				do {
					System.out.println("\n------------- Tela de Cadastros -------------\n");
					System.out.println("              Você deseja cadastrar: ");
					System.out.println("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
					escolhaUsuario = scanner.nextInt();
					switch (escolhaUsuario) {
					case 1: {
						System.out.println("Cadastrar Convidados...");
						// TODO metodo para cadastrar convidados
						continuarCadastro = 0;
						break;
					}
					case 2: {
						System.out.println("Cadastrar Carnes...");
						// TODO metodo para cadastrar carnes
						continuarCadastro = 0;
						break;
					}
					case 3: {
						System.out.println("Cadastrar Refrigerantes...");
						// TODO metodo para cadastrar refrigerantes
						continuarCadastro = 0;
						break;
					}
					case 4: {
						System.out.println("Cadastrar Cervejas...");
						// TODO metodo para cadastrar cervejas
						continuarCadastro = 0;
						break;
					}
					case 0: {
						System.out.println("Voltando para a tela inicial...");
						continuarCadastro = 1;
						break;
					}
					default:
						System.out.println("Escolha uma opcao valida");
					}
				} while (continuarCadastro == 0);
				break;
			}
			case 2: {
				int continuarVisualizacao = 0;
				do {
					System.out.println("\n------------- Tela de Visualização-------------\n");
					System.out.println("              Você deseja visualizar: ");
					System.out.println("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
					escolhaUsuario = scanner.nextInt();
					switch (escolhaUsuario) {
					case 1: {
						System.out.println("Visualizar Convidados...");
						// TODO metodo para visualizar convidados
						continuarVisualizacao = 0;
						break;
					}
					case 2: {
						System.out.println("Visualizar Carnes...");
						// TODO metodo para visualizar carnes
						continuarVisualizacao = 0;
						break;
					}
					case 3: {
						System.out.println("Visualizar Refrigerantes...");
						// TODO metodo para visualizar refrigerantes
						continuarVisualizacao = 0;
						break;
					}
					case 4: {
						System.out.println("Visualizar Cervejas...");
						// TODO metodo para visualizar cervejas
						continuarVisualizacao = 0;
						break;
					}
					case 0: {
						System.out.println("Voltando para a tela inicial...");
						continuarVisualizacao = 1;
						break;
					}
					default:
						System.out.println("Escolha uma opcao valida");
					}
				} while (continuarVisualizacao == 0);
				break;
			}
			case 3: {
				System.out.println("\n------------- Como Funciona o Sistema -------------\n");
				// TODO metodo de como funciona o programa
				break;
			}
			case 4: {
				System.out.println("\n------------- Calcular Valor por Pessoa -------------\n");
				// TODO metodo para calcular valor por pessoa
				System.out.println("O valor parcial para cada pessoa vai ficar: ");
				break;
			}
			case 0: { // sair
				System.out.println("              Saindo do Programa...");
				continuarLoop = 0;
				break;
			}
			default:
				System.out.println("Escolha Uma Opção Válida");
				continuarLoop = 1;
			}
		} while (continuarLoop == 1);

		scanner.close();
	}

	/**
	 * TODO CRIAR MENSAGEM DE INTRODUÇÃO (COMO USAR NOSSO PROGRAMA)
	 * 
	 * @author Bruno Polido
	 */
	public void introducao() {
		
	}

}
