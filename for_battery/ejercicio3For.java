import java.io.*;

public class ejercicio3For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa que demani dos números a l’usuari i escrigui tots els números entre el primer i el segon. 
 *  Tingues en compte els casos que el primer nombre sigui més gran, més petit o igual que el segon.*/
    
	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	System.out.println("Introduzca un segundo numero");
	String rawNumber2 = reader.readLine();
	int number2 = Integer.parseInt(rawNumber2);
	
	while(number >= number2 ){
	System.out.println("Error, el numero 1 debe ser menor que el numero 2");
	
	System.out.println("Introduzca un numero");
	rawNumber = reader.readLine();
	number = Integer.parseInt(rawNumber);
	
	System.out.println("Introduzca un segundo numero");
	rawNumber2 = reader.readLine();
	number2 = Integer.parseInt(rawNumber2);
	
	}
	for ( int i = number +1 ; i < number2; i++){
		System.out.print(i + " ");
	}
		
	}
}

