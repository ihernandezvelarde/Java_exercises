import java.io.*;

public class ejercicio1 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Introduzca su apellido");
	String userAnswer = reader.readLine();
	System.out.println("Introduzca un apellido que le guste");
	String userAnswer2 = reader.readLine();
	String result =  userAnswer + "\s" + userAnswer2;
	System.out.print(result);
	
//Nose si esto es lo que el enunciado está pidiendo
	
	
	}
}

