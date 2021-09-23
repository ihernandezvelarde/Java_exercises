import java.io.*;

public class ejercicio2 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Introduce el primer numero");
		
		String userPrimerNumero = reader.readLine();
		
		int userNumero = Integer.parseInt(userPrimerNumero);
		
		
		System.out.println("Introduce el segundo numero");
		
		String userSegundoNumero = reader.readLine();
		
		int userNumero2 = Integer.parseInt(userSegundoNumero);
	
		
		int myResult = userNumero + userNumero2;
		
		System.out.println("este sera el resultado final");
		
		System.out.println(myResult);
				

		
	}
}

