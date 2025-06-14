package testandoString;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
	    /*s.replaceAll("1", "2");
	    System.out.println(s);*/
		
		//Primeiro modo de substituir caracteres
		String primeira = s.replaceAll("1", "2");
		
		//segundo modo de substituir caracteres
		String segunda = s.replace("1", "2");
		
		System.out.println(s);
		System.out.println(primeira);
		System.out.println(segunda);
		
		/*Com "replaceAll()" voc� substitui a express�o encontrada (regex) e a substitui em todas as ocorr�ncias,
		J� com o "replace()" voc� substitui uma sequ�ncia de caracteres fixa */
		
		String text = "verdura verde  verdinho";
		System.out.println("Com replace: "+text.replace("verde",   "amarelo"));
		System.out.println("Com replaceAll: "+text.replaceAll("verd[eiu]",   "AMARELO"));
	}
}

