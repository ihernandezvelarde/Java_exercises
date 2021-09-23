import java.io.*;

public class ejercicio13For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa que demani a l’usuari un nombre positiu més gran que 0.  
 * El programa escriurà una línia per nombre entre el nombre introduït i el 1 (és a dir, decreixentment). 
 * A cada línia escriurà tots els nombres des de l’1 fins el nombre corresponent a la línia. Ex. si l’entrada és 5 la sortida serà
    1, 2, 3, 4, 5
    1, 2, 3, 4
    1, 2, 3
    1, 2
    1

*/

	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	System.out.println("Introduzca un numero");
	String rawNumber2 = reader.readLine();
	int number2 = Integer.parseInt(rawNumber2);
	
    for (int i = 1; i <= number2; i++) {
        for (int j = 1; j <= number; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }


}
}

	
	
