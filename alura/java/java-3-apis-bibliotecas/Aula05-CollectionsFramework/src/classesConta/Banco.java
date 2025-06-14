/*
 * Obs: Aqui nesta Classe temos os exerc�cios:
 * 		* Criando a Classe Banco
 * 		* Alterando a Classe Banco
 * 		
 */

package classesConta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	// Criando uma lista de contas gen�ricas dentro de "Banco"
	private List<Conta> contas = new ArrayList<>();

	// Utilizando Map para testar alguns m�todos
	Map<String, Conta> mapaDeContas = new HashMap<>();

	// Criando um m�todo sem retorno apenas para adicionar as contas
	public void adicionaConta(Conta conta) {
		contas.add(conta);
		mapaDeContas.put(conta.getNome(), conta);
	}

	// M�todo que retorna uma conta de uma posi��o espec�fica
	public Conta buscaConta(int posicao) {
		return contas.get(posicao);
	}

	// M�todo que retorna a quantidade de contas existentes no Banco
	public int quantidadeDeContas() {
		return contas.size();
	}

	// M�todo que busca conta por nome
	public Conta buscaPorNome(String nome) {
		return mapaDeContas.get(nome);
	}

}
