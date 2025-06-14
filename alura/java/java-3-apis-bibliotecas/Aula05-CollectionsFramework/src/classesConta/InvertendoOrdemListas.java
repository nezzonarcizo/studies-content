package classesConta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InvertendoOrdemListas {
	public static void main(String[] args) {

		List<String> frutas = new ArrayList<>();

		// Teste com uma lista um "pouquinho" grande kkk
		frutas.add("Laranja");
		frutas.add("Ma��");
		frutas.add("Banana");
		frutas.add("Pera");
		frutas.add("Melancia");
		frutas.add("Uva");
		frutas.add("Quiui");
		frutas.add("Cupua�u");
		frutas.add("Abacaxi");
		frutas.add("Goiaba");
		frutas.add("Ameixa");
		frutas.add("Coco");
		frutas.add("Amora");
		frutas.add("Jabuticaba");
		frutas.add("Pessego");
		frutas.add("Lim�o");
		frutas.add("Morango");
		frutas.add("Jaca");
		frutas.add("Jatob�");
		frutas.add("Carambola");
		frutas.add("A�a�");
		frutas.add("Guaran�");
		frutas.add("Acerola");
		frutas.add("Manga");
		frutas.add("Caju");
		frutas.add("Ing�");
		frutas.add("Siriguela");
		frutas.add("Abacate");
		frutas.add("Rom�");
		frutas.add("Pitanga");
		frutas.add("Mam�o");
		frutas.add("Maracuj�");
		frutas.add("Mel�o");
		frutas.add("Pinha");
		frutas.add("Cereja");
		frutas.add("Tangerina");
		frutas.add("Mexerica");
		frutas.add("Ponc�");

		// Imprimindo itens da Collection na ordem que foram adicionados
		// System.out.println(frutas);

		// Organizando os itens da Lista. Como � uma Collection de Strings o
		// "compareTo()" j� existente na classe "String" vai organizar em ordem
		// alfab�tica
		Collections.sort(frutas);
		System.out.println("Imprimindo Collection em ordem alfab�tica: " + frutas);

		// Embaralhando a ordem da Lista novamente
		Collections.shuffle(frutas);
		System.out.println("Imprimindo Collection em ordem aleat�ria: " + frutas);

		// Invertendo a ordem da Collection
		Collections.sort(frutas);
		Collections.reverse(frutas);
		System.out.println("Imprimindo Collection em ordem invertida: " + frutas);

		// Agora utilizaremos o m�todo "reverseOrder()"

		// Criando um objeto "LinkedList"
		LinkedList<Integer> list = new LinkedList<Integer>();

		// populate the list
		list.add(-28);
		list.add(20);
		list.add(-12);
		list.add(8);

		// Criando um "Comparator" para a ordem reversa
		Comparator<Integer> cmp = Collections.reverseOrder();

		// Organizando a Lista
		Collections.sort(list, cmp);

		System.out.println("Lista Organizada na Ordem Reversa: ");
		for (int i : list) {
			System.out.println(i + " ");
		}

		/*
		 * Rotacionando a Lista Com este m�todo escolhemos pelo indice (index) a partir
		 * de qual item rotacionaremos Exemplo lista(t, a, n, k, s), para *rotate(lista,
		 * -4) ou rotate(list, 1), teremos lista(s, t, a, n, k)
		 * 
		 * No exemplo abaixo (com -3) rotacionamos a lista de forma que os 3 primeiros
		 * elementos foram para o final da Lista
		 */
		List<String> objetos = new ArrayList<>();
		objetos.add("Apagador");
		objetos.add("Borracha");
		objetos.add("Caneta");
		objetos.add("Dado");
		objetos.add("Escada");
		objetos.add("Ferro");
		objetos.add("Garfo");
		Collections.rotate(objetos, -3);
		System.out.println("Imprimindo Collection Rotacionada: " + objetos);

		/*
		 * Resumidamente...
		 * 
		 * reverse(List<?> list) - Inverte a ordem dos elementos em uma lista
		 * espec�fica. 
		 * 
		 * rotate(List<?> list, int distance) - Rotaciona os elementos de
		 * uma lista espec�fica a uma dist�ncia espec�fica. 
		 * 
		 * shuffle(List<?> list) -
		 * Troca aleatoriamente a lista espec�fica usando um c�digo padr�o de
		 * aleatoriedade.
		 * 
		 */
	}
}
