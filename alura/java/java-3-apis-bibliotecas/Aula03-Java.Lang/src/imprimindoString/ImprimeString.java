package imprimindoString;

public class ImprimeString {
	public ImprimeString() {
	}

	public void metodoImprimeString(String x) {
		for (int i = 0; i < x.length(); i++) {
			System.out.println(x.charAt(i));
		}
	}

	public void imprimeStringAoContratio(String x) {
		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}
		System.out.println();
	}

	public void inverteString(String x) {
		String[] palavras = x.split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println("");

		/*
		 * Para imprimir na ordem correta 
		 * for(int i = 0; i <= palavras.length - 1; i++){ 
		 * 		System.out.println(palavras[i]); 
		 * }
		 */
	}

	public static void main(String[] args) {
		String a = "Alura";
		int n = a.length();

		for (int i = 0; i < n; i++) {
			System.out.println(a.charAt(i));
			System.out.println("");
		}

		ImprimeString m = new ImprimeString();
		String x = "cursos";
		m.metodoImprimeString(x);
		System.out.println();

		/*
		 * Estas fun��es abaixo s�o do Exerc�cio "Reescrevendo M�todos", onde escrevemos
		 * as frases ao contr�rio utilizando o m�todo criado no exerc�cio anterior.
		 */
		m.imprimeStringAoContratio("Socorram-me, subi no onibus em Marrocos");
		m.imprimeStringAoContratio("anotaram a data da maratona");

		// Exerc�cio "Invertendo a Ordem" usando o m�todo Split da classe String
		m.inverteString("Socorram-me, subi no onibus em Marrocos");
		m.inverteString("boo;and;foo");
	}
}
