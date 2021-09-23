import java.io.*;

	public class ejercicio10{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Escriu un programa que mostri el resultat de l’equació de tercer grau. 
	 * Per a realitzar el programa s’hauran de llegir els coeficients (a, b, c i d) i el valor de x. 
	 * El resultat es mostrarà per pantalla.
	 * ax^3+bx^2+cx+d=0 */
	 
	System.out.println("Introduzca el valor que le quiere dar a 'A' por favor");
	String userAnswer = reader.readLine();
	int varA = Integer.parseInt(userAnswer);
	
	System.out.println("Introduzca el valor que quiere dar a 'B' por favor");
	String userAnswer2 = reader.readLine();
	int varB = Integer.parseInt(userAnswer2);
	
	System.out.println("Introduzca el valor que quiere dar a 'C' por favor");
	String userAnswer3 = reader.readLine();
	int varC = Integer.parseInt(userAnswer3);
	
	System.out.println("Introduzca el valor que quiere dar a 'D' por favor");
	String userAnswer4 = reader.readLine();
	int varD = Integer.parseInt(userAnswer4);	
								
	System.out.println("Introduzca el valor que quiere dar a 'X' por favor");
	String userAnswer5 = reader.readLine();
	int varX = Integer.parseInt(userAnswer5);
	
	double result =  Math.pow( varA * varX, 3);
	double result2 = result + Math.pow( varB * varX, 2) + varC * varX + varD;
	System.out.println(result2);
	
	
	}
}
