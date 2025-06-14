package classesConta;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ConsultandoDocumentacao {
	public static void main(String[] args) {
		
		
		/*
		 * Criando Lista, adicionando v�rias contas de empregados e gerando um saldo aleat�rio para cada um deles
		 * Podemos definir tamb�m como parametro do nextInt() o valor m�ximo que desejamos ter
		 */
		List<Conta> contas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Random x = new Random();
			ContaCorrente cc = new ContaCorrente("Empregado", x.nextInt(1000));
			contas.add(cc);
		}
		
		/*
		 * Aqui iremos imprimir a Lista de Empregados com seus respectivos saldos
		 * Ser� utilizado o Foreach e como n�o foi definido o nome de cada um dos empregados
		 * daremos um numeral em seu lugar de forma crescente utilizando um contador
		 */
		int contador = 1;
		for (Conta empregado : contas) {
			System.out.println("Empregado: " + contador + " Saldo: " + empregado.getSaldo());
			contador++;
		} 
			
	}
}
