import java.io.*;


public class ejercicio14 {
	
	public static void main (String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	//Programa que demani  un nombre sencer i mostri l’últim dígit.
	
	//Pedir nombre
	
	System.out.println ("Introduzca un nombre entero por favor");
	String completNumb = reader.readLine();
	
	//Imprimir resultado
	System.out.println("last char = " + completNumb.charAt(completNumb.length() - 1));
	}
}

