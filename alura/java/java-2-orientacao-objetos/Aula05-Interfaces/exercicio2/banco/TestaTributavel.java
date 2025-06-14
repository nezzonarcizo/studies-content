package banco;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//Testando Polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		/*System.out.println(t.getSaldo());
		 * Apesar de ser um objeto do tipo ContaCorrente, ao chamarmos ele de Tributavel, apenas garantimos para o compilador que aquele objeto tem 
		 * os m�todos que todo Tributavel tem. E como o compilador do Java s� trabalha com certezas, ele s� permite chamar os m�todos definidos no 
		 * tipo da vari�vel. 
		 */
	}
}
