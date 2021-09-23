import java.io.*;

public class ejercicio12For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa que demani a l’usuari un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment). A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins al 1. Ex. si l’entrada és 5 la sortida serà
    1i
    2, 1
    3, 2, 1
    4, 3, 2, 1
    5, 4, 3, 2, 1

*/
	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
   
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
		  System.out.print(i -(j-1));
		 // System.out.println(j+" ESTO ES J");
      }
      System.out.println("");
    }

  }
}

	
	
