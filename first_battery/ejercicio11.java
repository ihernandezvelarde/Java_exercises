import java.io.*;

	public class ejercicio11{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Programa que demani una quantitat –preu d’un producte – i calculi i visualitzi la quantitat d’IVA (aplicant un percentatge del 21 %) 
	 * i la quantitat total a pagar (preu original + Iva).*/
	 
	System.out.println("Introduzca el precio del producto por favor ");
	String userAnswer = reader.readLine();
	double varProduct = Integer.parseInt(userAnswer);
	
	double result  = varProduct * 0.21 ;
	System.out.println ("El iba del producto seria: " + result);
	System.out.println ("El producto total a pagar sera: ");
	System.out.println( + varProduct + result);
	}
}
