package banco;

public class ValorInvalidoException extends RuntimeException {

	private final double valor;

	public ValorInvalidoException(double valor) {
		super("Valor n�o est� correto: " + valor);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
