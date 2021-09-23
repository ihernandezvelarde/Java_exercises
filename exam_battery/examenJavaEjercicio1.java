import java.io.*;

public class examenJavaEjercicio1 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa en Java que donats dos números enters, ens sumi tots els que hi han al rang (inclosos ells mateixos). 
 *  Heu de valida que el segon número no sigui inferior al primer; si és el mateix, el resultat ha d'ésser el mateix número
*/
    int contador = 0;
	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	System.out.println("Introduzca un numero");
	String rawNumber2 = reader.readLine();
	int number2 = Integer.parseInt(rawNumber2);
	while(number2 < number){ 
			System.out.println("ERROR el primer numero no puede ser inferior al segundo"); 
			System.out.println("Introduzca un numero");
			rawNumber = reader.readLine();
			number = Integer.parseInt(rawNumber);
				
			System.out.println("Introduzca un numero");
			rawNumber2 = reader.readLine();
			number2 = Integer.parseInt(rawNumber2);
		}				
	for (int i = number; i <= number2; i++){
		contador = contador + i;
	}
	System.out.print("La suma de los numeros del numero 1 al numero 2: " + contador);
	}
	}


