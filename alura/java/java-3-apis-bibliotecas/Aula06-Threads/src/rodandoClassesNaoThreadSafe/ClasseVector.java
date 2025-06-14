package rodandoClassesNaoThreadSafe;

import java.util.Vector;

public class ClasseVector implements Runnable {
	private int comeco;
	private int fim;
	private Vector<String> mensagens;

	public ClasseVector(int comeco, int fim, Vector<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	/*
	 * Agora, n�o importa quantas vezes executemos, n�o tomamos o erro novamente. 
	 * Olhando o m�todo add do Vector notamos que ele � um m�todo synchronized:	  
	 * public synchronized boolean add(E e) {
	 * 
	 * obs: Parece que praticamente todos os m�todos dentro de Vector s�o Synchronized
	 */
	public void run() {
		for (int i = comeco; i < fim; i++) {
			mensagens.add("Mensagem " + i);
		}
	}
}
