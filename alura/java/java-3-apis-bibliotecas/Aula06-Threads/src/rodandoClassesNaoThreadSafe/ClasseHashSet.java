package rodandoClassesNaoThreadSafe;

import java.util.HashSet;

public class ClasseHashSet implements Runnable {
	private int comeco;
	private int fim;
	private HashSet<String> mensagens;

	public ClasseHashSet(int comeco, int fim, HashSet<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	/*
	 * Essas duas s�o tamb�m classes n�o thread-safe (LinkedList e HashSet). � comum
	 * que percamos registros com elas tamb�m, mas particularmente em alguns casos,
	 * o HashSet e a LinkedList se perdem mais ainda e nunca terminam de executar!
	 */
	public void run() {
		for (int i = comeco; i < fim; i++) {
			mensagens.add("Mensagem " + i);
		}
	}
}
