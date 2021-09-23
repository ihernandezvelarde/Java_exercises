import java.io.*;

	public class ejercicio15{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	//Escriu un programa que demani a l’usuari la quantitat de segons i mostri per pantalla a quantes hores, minuts i segons corresponen 
	//(p.ex: 3661 segons corresponen a 1 hora + 1 minut + 1 segon).
	 
	 System.out.println ("Introduzca los segundos por favor");
	 
	 
	 String answer = reader.readLine();
	 int seconds = Integer.parseInt(answer);
	 
	 
	 int horas = seconds/3600;
	 
	 
	 
	 int minuts = (seconds - (horas * 3600)) /60; // Restamos los segundos introducidos por el usuario las horas totales (PASADAS A SEGUNDOS) y el resultado lo dividimos entre 60, para tener los minutos
	 
	 int rawSeconds = (seconds - (minuts * 60)) - (horas * 3600); // Restamos los segundos introducidos por el usuario menos los minutos (en segundos) y las horas (en segundos)
	 	 
	 System.out.println(horas + " horas");
	 System.out.println(minuts + " minutos");
	 System.out.println(rawSeconds + " segundos");

	 
	 
	}
}
