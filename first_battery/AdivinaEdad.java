import java.io.*;


// Dado una fecha de nacimiento introducida por el USUARIO, imprimir la edad en 2020

public class AdivinaEdad {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca su año de nacimiento");
	String user = reader.readLine();
	int numEntero = Integer.parseInt(user);
	int yo = 2020;
	int result = yo - numEntero; 

	System.out.print("Su edad en 2020 es: ") ;
	System.out.print(result) ;
	
	
		
	}
}

