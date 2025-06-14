package rodandoClassesNaoThreadSafe;

import java.util.Collection;

public class ProduzMensagens implements Runnable {
	private int comeco;
	private int fim;
	private Collection<String> mensagens;

	public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	public void run() {
		for (int i = comeco; i < fim; i++) {
			/*
			 * Exerc�cio: Cole��o Synchronized Tornar a cole��o synchronized resolve o
			 * problema: agora, s� � poss�vel rodar o c�digo dentro desse bloco quando
			 * ningu�m mais estiver usando esse objeto.
			 */
			synchronized (mensagens) {
				mensagens.add("Mensagem " + i);
			}
		}
	}
}
