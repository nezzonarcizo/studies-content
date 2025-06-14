package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {
	public static <T> void main(String[] args) {

		ContaPoupanca cp = new ContaPoupanca("Lockheed", 700);
		ContaPoupanca cp1 = new ContaPoupanca("Hawk", 600);
		ContaPoupanca cp2 = new ContaPoupanca("Nezzo", 500);

		ContaCorrente cc = new ContaCorrente("Marlon", 1000);
		ContaCorrente cc1 = new ContaCorrente("Augusto", 900);
		ContaCorrente cc2 = new ContaCorrente("Narcizo", 800);

		List<Conta> contas = new ArrayList<Conta>(); // Podemos usar tambem o "Operador Diamante" new ArrayList<>();
		contas.add(cp);
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cc);
		contas.add(cc1);
		contas.add(cc2);
		/*
		 * Agora utilizaremos o m�todo sort() para verificar se a ordem se dar� pelo
		 * saldo como definino no m�todo compareTo().
		 */

		/*
		 * Observa��o: Se tentarmos usar o m�todo "sort()" com o tipo "Contas" ou objeto
		 * qualquer que n�o seja primitivo sem implementar o "Comparable<Object>", ele
		 * n�o vai identificar o m�todo compareTo() mesmo que ele esteja declarado
		 * dentro da sua classe, pois a interface � como um contrato e sem "assin�-lo" a
		 * exist�ncia do m�todo � s� uma coincid�ncia e n�o d� a certeza para a JVM de
		 * que a inten��o era mesmo assinar aquele contrato. Tipos primitivos j� tem o
		 * "compareTo" por padr�o dentro de suas classes, eles j� implementam por padr�o
		 * o "comparable", por isso podemos usar o metodo sort() sem problemas se
		 * tivermos uma Collection de seu tipo. E se n�o sobreescrevermos o m�todo
		 * estruturando para comparar com um atributo desejado, no M�ximo ir� imprimir
		 * os objetos na ordem que foram adicionados.
		 */

		Collections.sort(contas);
		// Looping de repeti��o para pegar o identificador e saldo da conta.
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getSaldo());
		}

		/*
		 * Podemos reparar que ele ordenou corretamente pelo atributo que utilizamos no
		 * m�todo compareTo().
		 *
		 */

		// Collection de String utilizando o m�todo sort() que chama o compareTo() j�
		// implementado na classe String
		List<String> lista = new ArrayList<>();
		lista.add("S�rgio");
		lista.add("Paulo");
		lista.add("Guilherme");

		Collections.sort(lista);
		System.out.println(lista);

		// Collection de Integer utilizando o m�todo sort() que chama o compareTo() j�
		// implementado na classe Integer
		List<Integer> listaNumeros = new ArrayList<>(); // Operador Diamante "<>()".
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(1);

		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
	}
}
