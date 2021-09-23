import java.io.*;

public class ejercicio6 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca lo que mide la base del rectangulo");
		String userAnswer = reader.readLine();
		double base = Double.parseDouble(userAnswer);
		
		
		System.out.println("Introduzca lo que mide la altura del rectangulo");
		String userAnswer2 = reader.readLine();
		double altura = Double.parseDouble(userAnswer2);
		
		
		
		double result = (base)*(altura);
		System.out.println("El area de este rectangulo sera:");
		System.out.println(result);
		
		
		}
}

