import java.io.*;

public class ejercicio4 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Por favor, introduzca un numero entero");
		String user = reader.readLine();
		int numEntero = Integer.parseInt(user); 
		int result = numEntero * numEntero * numEntero * numEntero;
		System.out.println("El resultado de este numero elevado a la cuarta potencia es:");
		System.out.println (result);
	}
}

