import java.io.*;

public class ejercicio1Examen1 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*Dissenyeu un programa en Java que calculi la mitjana dels números naturals que introdueixi l’usuari.  
	 * El programa anirà demanant números naturals (heu de validar que siguin per tant positius).  
	 * Quan l’usuari introdueixi un 0, el programa mostrarà la mitjana i terminarà.  
	 * En contes de imprimir la mitjana, imprimireu un error si l’usuari no ha entrat cap número correcte).*/


	double lowestNote = 10;
	double allNotes = 0;
	double allNotes2 = 0;
	double infinite = 1;
	String rawNote = reader.readLine();
	double note = Integer.parseInt(rawNote);
	int yes = 0;
	

		for (int i = 0; i <infinite; i++){
		System.out.println ("Introduzca la nota de la que quiere hacer la media por favor");
		rawNote = reader.readLine();
		note = Integer.parseInt(rawNote);
		
		
		while(note < 0 || note >10){ 
			System.out.println("ERROR la nota NO puede ser menor que 1 o mayor que 10"); 
			System.out.println ("Introduzca la nota de la que quiere hacer la media por favor");
			rawNote = reader.readLine();
			note = Integer.parseInt(rawNote);
		}
		
		allNotes = allNotes + note;
		
		if (note == yes) {
			break;
			} else{
				infinite = infinite + 1;
				}
	}
	allNotes2 = allNotes/infinite;
		
	System.out.println("La nota media  de todas las introducidas es " + allNotes2);
	
}
}
	
	
	
