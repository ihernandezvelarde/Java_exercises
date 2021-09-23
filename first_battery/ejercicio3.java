import java.io.*;

public class ejercicio3 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Por favor, introduzca su edad (solo numero):");
		String user = reader.readLine();
		int numEntero = Integer.parseInt(user);
		System.out.println("Su edad de aqui a un cuarto de siglo sera:");
		int result = numEntero + 25;
		System.out.println (result);
		
	}
}

