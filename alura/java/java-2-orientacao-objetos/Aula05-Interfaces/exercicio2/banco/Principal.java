package banco;

public class Principal {
	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();

		conta.setNome("Narcizo");
		contaCorrente.setNome("Marlon");
		contaPoupanca.setNome("Augusto");

		conta.deposita(100.0);
		contaCorrente.deposita(100.0);
		

		System.out.printf("O saldo �: %.2f\n", conta.getSaldo());
		
		/*Conta [] arrayDeContas = new Conta[10]; Aqui n�o ocorre erro porque n�o estamos instanciando nenhum objeto, mas sim
													Criando um array com 10 espa�os para o tipo Conta*/
	}
}
