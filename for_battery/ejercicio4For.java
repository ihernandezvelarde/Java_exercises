import java.io.*;

public class ejercicio4For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa que demani un número a l’usuari i escrigui la suma de tots els números entre l’introduït i el 1. 
 * Ex. si l’entrada és
    4
Com que 10 = 1 + 2 + 3 + 4, la sortida serà
    10
*/
    int contador = 0;
	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	for (int i = 1; i <= number; i++){
		contador = contador + i;
	}
	System.out.print("La suma de los numeros del 1 al introducido es " + contador);
	}
	}


