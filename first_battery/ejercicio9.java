import java.io.*;

public class ejercicio9{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	//Exercici 9. Realitza un programa que calculi el àrea i el perímetre d’una circumferència. L’usuari haurà d’introduir el radi de la circumferència. ( A = π * r^2) ( P=2*π*r).


		System.out.println("Introduzca lo que mide el radio de la circumferencia");
		String userAnswer = reader.readLine();
		double radio = Double.parseDouble(userAnswer);
		
		double result = Math.PI * (radio);
		double resultTwo = Math.pow(result, 2);
		
		double resultThree = 2 * Math.PI * (radio);
		
		System.out.println("El resultado del area de la circunferencia es");
		System.out.println(resultTwo);
		System.out.println("El resultado del perimetro de la circumferencia es");
		System.out.println(resultThree);
	}
}
