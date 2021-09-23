import java.io.*;

public class ejercicio2For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa que demani a l’usuari el seu nom i un número enter més gran que 1, i escrigui el seu nom tants cops com indiqui el número. Ex. si l’entrada és
    Truman
    3
	La sortida serà
    Truman Truman Truman*/
    
	System.out.println("Introduzca su nombre");
	String name = reader.readLine();
	System.out.println("Introduzca el numero de veces que quiere que se imprima su nombre");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
		
	while(number < 1){
	System.out.println("Error, el numero debe ser mayor que 1, introduzcalo de nuevo");
	rawNumber = reader.readLine();
	number = Integer.parseInt(rawNumber);
	}
	for ( int i = 0; i < number; i++){
		System.out.print(name + " ");
	}	
		
	}
}

