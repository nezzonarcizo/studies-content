package br.com.empresa.banco.conta;


public class ValorInvalidoException
  extends RuntimeException
{
  private static final long serialVersionUID = 1L;
  private final double valor;
  
  public ValorInvalidoException(double valor)
  {
    super("Valor n�o est� correto: " + valor);
    this.valor = valor;
  }
  
  public double getValor() {
    return valor;
  }
}
