package boasPraticas;

import java.io.BufferedReader;

public class BoasPraticas
{
  public BoasPraticas() {}
  //Um pouco mais de Polimorfismo
  /*Qualquer classe que seja um InputStream serve al�. As que a pr�pria API do Java traz consigo s�o encontradas 
    	na documenta��o da pr�pria InputStream no campo Direct Known Subclasses.
		AudioInputStream, ByteArrayInputStream, FileInputStream, InputStream (do CORBA), ObjectInputStream, 
		PipedInputStream, SequenceInputStream, StringBufferInputStream, FilterInputStream.

		Essa �ltima, ainda tem suas filhas que, ainda que indiretamente, tamb�m s�o um InputStream. 
		S�o elas: BufferedInputStream, CheckedInputStream, CipherInputStream, DataInputStream, DeflaterInputStream, 
		DigestInputStream, InflaterInputStream, LineNumberInputStream, ProgressMonitorInputStream, 
		PushbackInputStream.
   
   */
  public static void main(String[] args) throws java.io.IOException
  {
	/*Deixando o c�digo mais curto. Com certeza, legibilidades � mais importante mas o modo abaixo � muito utilizado 
	  e muito comum */
    BufferedReader br = new BufferedReader(
    		new java.io.InputStreamReader(
    				new java.io.FileInputStream("Arquivo.txt")));
    
    String msg = br.readLine();
    while (msg != null) {
      System.out.println(msg);
      msg = br.readLine();
    }
    br.close();
  }
}