import java.io.*;

public class ejercicio7 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su nombre por favor");
		String name = reader.readLine();
		
		
		System.out.println("Ahora, introduzca su edad por favor");
		String userAnswer = reader.readLine();
		int number = Integer.parseInt(userAnswer);
		
		
		
		
		System.out.println ("Hola " + (name) + (" su edad es ")+ (number)); 
		
	}
}

