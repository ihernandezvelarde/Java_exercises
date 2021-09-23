import java.io.*;

public class ejercicio8For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Modifica el programa anterior per tal que en lloc de demanar la nota dels 10 alumnes, 
 * sigui l'usuari qui decideixi quan desitja finalitzar la introducció de dades, responent negativament a una qüestió del tipus: 'Desitja finalitzar (S/N)?'.  */

	double lowestNote = 10;
	double allNotes = 0;
	double allNotes2 = 0;
	double infinite = 1;
	String yes = "s";
	String no = "n";
	
		
		for (int i = 0; i <infinite; i++){
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
		
		System.out.println ("Desea finalizar S/N?");
		String userAnswer = reader.readLine();
		if (userAnswer.equals(yes)) {
			break;
			} else{
				infinite = infinite + 1;
				}
				
	}
	allNotes2 = allNotes/infinite;
		
	System.out.println("La nota media es " + allNotes2);
	System.out.println("La nota mas peque es " + lowestNote);
}
}
	
	
	
