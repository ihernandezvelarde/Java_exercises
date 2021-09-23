import java.io.*;

public class ejercicio2Examen1B {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*Feu un programa que llegeixi un número enter positiu des del teclat, li sumi un 1, i mostri el número de xifres que té el resultat.  
	 * Heu de dissenyar un algorisme que funcioni per qualsevol número (obviant que hi han restriccions segons els diferents compiladors pel que fa al límit màxim d’un enter).
	 *    No cal validar les dades d’entrada. 
	*/
	 
	 String numberRaw = reader.readLine();
	 int number = Integer.parseInt(numberRaw);
	 
    
	 System.out.println("Introduzca un numero entero al que le sumaremos 1 y por pantalla saldra cuantas cifras tiene el resultado");
	 numberRaw = reader.readLine();
	 number = Integer.parseInt(numberRaw);
	 
	 int result = number +1;
	 int length = String.valueOf(result).length();
	 
	 System.out.print("La suma tiene " + (length) + " cifras");
	
	 
	 
	

	}
}
	

		
				
	

	



