import java.io.*;

public class ejercicio5 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la cantidad de euros que quiere pasar a pesetas por favor:");
		String userAnswer = reader.readLine();
		int numEuro = Integer.parseInt(userAnswer);
		double result = (numEuro) * 166.386;
		System.out.println("Esta cantidad de euros pasados a pesetas son:");
		System.out.println(result);
	
	}
}

