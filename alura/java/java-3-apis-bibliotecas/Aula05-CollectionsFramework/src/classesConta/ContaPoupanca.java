package classesConta;

public class ContaPoupanca extends Conta {

	/*
	 * M�todo que chama o construtor de conta que gera o n�mero da conta
	 * automaticamente
	 *
	 */
	public ContaPoupanca(String nome, double saldo) {
		super(nome, saldo, "CP");
		// TODO Auto-generated constructor stub
	}

	/*
	 * M�todo que chama o construtor de conta que gera o n�mero da conta de forma
	 * manual
	 */
	public ContaPoupanca(int numero, String nome, double saldo) {
		super(numero, nome, saldo, "CP");
	}
}
