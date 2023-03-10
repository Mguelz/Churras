package br.com.churras.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.churras.model.Item;

/**
 * 
 * @author Matheus Martins Santos
 * 
 */
public class ItensChurrasService {

	private Map<String, List<Item>> mapa = new HashMap<>();

	/**
	 * 
	 * 
	 * Método de retorno do mapa com os itens cadastrados caso o item não exista,
	 * cria a lista vazia.
	 * 
	 * @return Retorna o mapa com as informações cadastradas
	 */
	public Map<String, List<Item>> getMapa() {
		if (!mapa.containsKey("carne")) {
			mapa.put("carne", new LinkedList<>());
		}
		if (!mapa.containsKey("refrigerante")) {
			mapa.put("refrigerante", new LinkedList<>());
		}
		if (!mapa.containsKey("cerveja")) {
			mapa.put("cerveja", new LinkedList<>());
		}

		return mapa;
	}

	/**
	 * 
	 * 
	 * Faz um pré cadastro dos itens de base, esse método é chamado no inicio da
	 * aplicação e pode ser chamado apenas uma vez.
	 * 
	 * @return Retorna o mapa com as informações cadastradas
	 */
	public void preCadastroItensBase() {
		List<Item> carnes = new LinkedList<>();
		carnes.add(new Item("Picanha", BigDecimal.valueOf(26.98)));
		carnes.add(new Item("Linguica", BigDecimal.valueOf(17.46)));
		carnes.add(new Item("Asa/Coxa", BigDecimal.valueOf(6.00)));
		mapa.put("carne", carnes);

		List<Item> refrigerantes = new LinkedList<>();
		refrigerantes.add(new Item("Coca-Cola", BigDecimal.valueOf(8.17)));
		mapa.put("refrigerante", refrigerantes);

		List<Item> cervejas = new LinkedList<>();
		cervejas.add(new Item("Heineken 6 latas", BigDecimal.valueOf(32.95)));
		mapa.put("cerveja", cervejas);
	}

	/**
	 * 
	 * 
	 * Limpa todos os itens de uma lista, ela deve ser especificada como parâmetro.
	 * A lista já vem pronta no Map, passar apenas ela como parâmetro.
	 * 
	 * @param (Lista de carne, refrigerante ou cerveja)
	 */
	public void limpaTodosItensCadastrados(List<Item> listaItem) {
		listaItem.clear();
	}

	/**
	 * 
	 * 
	 * Limpa apenas um item de uma lista.
	 * 
	 * @param tipo, nome
	 */
	public void limpaApenasItemSelecionado(String tipo, String nome) {
		int linha = 0;
		for (Item item : mapa.get(tipo)) {
			if (item.getNome().equals(nome)) {
				break;
			}
			linha++;
		}

		if (linha < mapa.get(tipo).size()) {
			mapa.get(tipo).remove(linha);
		} else {
			System.out.println("\n Nome do item não existente \n");
		}
	}
}
