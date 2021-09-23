import java.io.*;

public class ejercicio8{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Exercici 8. Escriu un programa que demani dos variables a l’usuari, i mostri per pantalla la seva suma, resta, multiplicació, divisió i mòdul .

		System.out.println("Por favor introduzca el primer numero que querra sumar, restar, multiplicar y dividir");
		String userPrimerNumero = reader.readLine();
		int userNumero = Integer.parseInt(userPrimerNumero);
		
		
		System.out.println("Ahora introduzca el segundo numero");
		String userSegundoNumero = reader.readLine();
		int userNumero2 = Integer.parseInt(userSegundoNumero);
		
		System.out.println("La suma, resta, multiplicacion y division de estos dos numeros es:");
		int myResult = userNumero + userNumero2;
		int myResult2 = userNumero - userNumero2; 
		int myResult3 = userNumero * userNumero2; 
		int myResult4 = userNumero / userNumero2;
		int myResult5 = userNumero % userNumero2;
		System.out.println("Suma " + (myResult));
		System.out.println("Resta " + (myResult2));
		System.out.println("Multiplicacion " + (myResult3));
		System.out.println("Division " + (myResult4));
		System.out.println("Modulo " + (myResult5));
		
		
		
		
	}
}


