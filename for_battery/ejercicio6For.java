import java.io.*;

public class ejercicio6For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Dissenyeu un programa que calculi el factorial d’un nombre sencer, demanat a l’usuari pel teclat, i li mostri el resultat del càlcul per la pantalla.  
*/
    int contador = 1;
	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	for (int i = 1; i <= number; i++){
		contador = contador * i;
	}
	System.out.print("La multiplicacion de los numeros del 1 al introducido es " + contador);
	}
	}


