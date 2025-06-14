package classesConta;

public class ContaCorrente extends Conta {

	/*
	 * M�todo que chama o construtor de conta que gera o n�mero da conta
	 * automaticamente
	 */
	public ContaCorrente(String nome, double saldo) {
		super(nome, saldo, "CC");
		// TODO Auto-generated constructor stub
	}

	/*
	 * M�todo que chama o construtor de conta que gera o n�mero da conta de forma
	 * manual
	 */
	public ContaCorrente(int numero, String nome, double saldo) {
		super(numero, nome, saldo, "CC");
		// TODO Auto-generated constructor stub
	}
}
