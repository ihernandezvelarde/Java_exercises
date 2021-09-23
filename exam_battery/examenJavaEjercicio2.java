import java.io.*;

public class examenJavaEjercicio2 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Desenvolupa un programa en Python que demani a l’usuari el seu nom i un número enter més gran que 1. 
 *  El programa ha d'escriure el seu nom tants cops com indiqui el número.  
 * Un cop fet això, ha de tornar a preguntar el nom i el número (i tornar a imprimir).  El programa finalitzarà si l'usuari escriu fi en comptes del seu nom.
Un exemple d'execució seria:
*/
 
    String fin= "fi";
    String name= "";
   do{
	System.out.println("Introduzca su nombre");
	name = reader.readLine();

	if (name.equals(fin)){
		System.out.println("Adios y gracias!");
		
	}else{
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
		System.out.println ("");
		
	} while (!name.equals(fin));

}
}

