package threads;

public class ProgramaThreads {
	public static void main(String[] args) {

		GeraPdf pdf = new GeraPdf();
		Thread threadPdf = new Thread(pdf);
		threadPdf.start();

		/*
		 * Se quisermos pausar uma Thread fazemos Thread.sleep(), entre parenteses
		 * definimos o tempo e lan�amos a InterruptedException
		 */

		/*
		 * Como a classe Thread pertence ao pacote java.lang mesmo, n�o precisamos fazer
		 * nenhum import java.lang � o �nico pacote do java que � importado
		 * automaticamente (String e System pertencem a ele tamb�m)
		 */

		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadBarraDeProgresso = new Thread(barraDeProgresso);
		threadBarraDeProgresso.start();

	}
}
