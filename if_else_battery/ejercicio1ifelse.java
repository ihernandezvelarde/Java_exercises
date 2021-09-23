import java.io.*;

public class ejercicio1ifelse {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 // Desenvolupa un programa que demani el nom i l’edat a l’usuari, i si és major de 18 anys li digui “Vostè ja pot anar a la presó!”. 
 // Finalment, sigui quina sigui l’edat de l’usuari el programa s’acomiadarà dient “Adéu «nom de l’usuari»!”.
	
	System.out.println("Introduzca su nombre");
	String name = reader.readLine();
	
	System.out.println("Introduzca su edad");
	String ageRaw = reader.readLine();
	int age = Integer.parseInt(ageRaw);
	
		if (age <= 18) {
			System.out.println("Aun puedes liarla sin que te pase nada ");
			System.out.println("Adios " + name);
	 
		} else {
			System.out.println("Cuidado que ya puedes ir a la carcel ");
			System.out.println("Adios " + name);

		}
	}
}
