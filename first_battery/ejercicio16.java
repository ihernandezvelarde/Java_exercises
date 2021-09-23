import java.io.*;
import java.util.Random;

public class ejercicio16 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random(); //instance of random class

	/*Genera un programa que donat un nom i un cognom (demanats a l'usuari), 
	 * generi un identificador d'usuari que és nom.cognom 
	 * i una contrasenya de 3 números que es generaran aleatòriament.*/
	 
	 System.out.println ("Introduzca su nombre por favor");
	 String name = reader.readLine();
	 System.out.println ("Introduzca su apellido por favor");
	 String lastName = reader.readLine();
	 System.out.println ( "El id es " + name + "." + lastName);
	 
	 int randomLimit = 9;
	 
	 int intRandomOne = rand.nextInt(randomLimit); 
	 int intRandomTwo = rand.nextInt(randomLimit); 
	 int intRandomThree = rand.nextInt(randomLimit); 

     
	 System.out.println ( "Tu PW es " + intRandomOne +""+ intRandomTwo + "" + "" + intRandomThree);



	 
	}
}
