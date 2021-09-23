import java.io.*;

public class ejercicio7For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Dissenya un programa que, en cada pas, li demani a l'usuari el nom i la nota de cadascun dels 10 alumnes d'una classe.
 *  Al final li mostrarà la mitjana de totes les notes i l'alumne amb la pitjor nota obtinguda.*/

	double lowestNote = 10;
	double allNotes = 0;
	double allNotes2 = 0;

	for (int i = 1; i <=10; i++){
		System.out.println ("Introduzca la nota");
		String rawNote = reader.readLine();
		double note = Integer.parseInt(rawNote);
		
		while(note < 0 || note >10){ 
			System.out.println("ERROR la nota no puede ser menor que 1 o mayor que 10"); 
			System.out.println ("Introduzca la nota");
			rawNote = reader.readLine();
			note = Integer.parseInt(rawNote);
		}
		if(lowestNote > note ){
			lowestNote = note;
		}
		allNotes = allNotes + note;
		allNotes2 = allNotes /10;
	}
	
		
	System.out.println("La nota media es " + allNotes2);
	System.out.println("La nota mas peque es " + lowestNote);
}
}
	
	
	
    

   
	
	


