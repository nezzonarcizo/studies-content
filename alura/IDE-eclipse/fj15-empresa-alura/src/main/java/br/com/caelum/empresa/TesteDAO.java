package br.com.caelum.empresa;

import java.util.List;

import br.com.caelum.empresa.dao.GastoDAO;
import br.com.caelum.empresa.modelo.Gasto;

public class TesteDAO {
	
	/*
	 * 	Templates s�o pequenas estruturas de c�digo configur�veis que 
	 * 	podemos usar para criar trechos pr�-definidos de c�digo. 
	 * 	Para acess�-los � s� digitar o nome do template e pressionar ctrl+espa�o. 
	 * 	O Eclipse j� vem com v�rios desses templates configurados
	 */
	
	public static void main(String[] args) {
		GastoDAO dao = new GastoDAO();
		List<Gasto> todos = dao.buscaTodos();
		
		/*
		for (Gasto gasto : todos) {
			System.out.println(gasto);
		}
		*/
		
		
		/* Temos a seguir um template baseado no foreach para impress�o dos gastos
		 * 
		 * Foreach para impress�o de uma lista do tipo ${enclosing_type}
		 * @author ${user}
		 * 
		 * for (${iterable_type} ${iterable_element} : ${iterable}) {
				System.out.println(${iterable_element});
			} 

		*/
		
		
		/**
		 * Foreach para impress�o de uma lista do tipo TesteDAO
		 * @author nesso
		 */
		for (Gasto gasto : todos) {
			System.out.println(gasto);
		}
	}
}
