import java.io.*;

public class ejercicio5For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa que demani el nom de l’usuari, l’edat i l’any actual. El programa escriurà l’edat que tenia l’usuari a cada any des del seu naixement i s’acomiadarà. Per exemple, si l’entrada és
    Anna
    5
    2015
El programa escriurà
    El 2010 va nàixer
    El 2011 tenia 1 any
    El 2012 tenia 2 anys
    El 2013 tenia 3 anys
    El 2014 tenia 4 anys
    Adéu Anna
L'aplicació no li dirà l'edat que té l'usuàri en l'any actual, donat que aquesta dada forma part de l'entrada. Per exemple, si la usuària ha nascut aquest any, simplement s'acomiadarà, i si ho va fer l'any passat, només dirà quan va néixer i s'acomiadarà.
Les comprovacions necessàries són: que el nom no estigui buit, que l'edat i l'any actual siguin positius (es pressuposa que seran enters), i que l'any actual sigui un valor més alt que el de l'edat.
*/
    int incrementoYears = 0;
    
	System.out.println("Introduzca su nombre");
	String name = reader.readLine();
	
	System.out.println("Introduzca su edad");
	String rawAge = reader.readLine();
	int age = Integer.parseInt(rawAge);
	
	System.out.println("Introduzca el anyo actual");
	String rawYear = reader.readLine();
	int currentYear = Integer.parseInt(rawYear);
	
	int birthYear = currentYear - age;
	
	System.out.println(" ");
	System.out.println("El " + birthYear + " nacio");

	for (int i = birthYear+1; i < currentYear; i++){
		incrementoYears = incrementoYears +1;
		if(incrementoYears == 1 ){
		System.out.println("El " + i + " tenia " + incrementoYears + "anyo");
		}else{
		System.out.println("El " + i + " tenia " + incrementoYears + "anyos");
	    }
	}
		System.out.println(" ");
		System.out.println("Adeu " + name);

	
	}
	}


