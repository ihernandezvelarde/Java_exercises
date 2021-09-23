import java.io.*;
import java.util.Scanner;
	public class ejercicio15ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Scanner in = new Scanner(System.in);
	//Programa que demani els coeficients d’una equació de segon grau (A x2 + B x + C) i calculi les seves arrels (el valor que fa que A x2 + B x + C = 0) 
	//controlant qualsevol tipus de problema (números imaginaris per exemple).  Cal que investigueu per Internet com pot calcular-se l’arrel d’una expressió.
	
	
	 System.out.println ("Introduzca el primer numero entrero");
	 String numberRaw = reader.readLine();
	 double A = Integer.parseInt(numberRaw);
	 
	 System.out.println ("Introduzca el segundo numero entrero");
	 String numberTwoRaw = reader.readLine();
	 double B = Integer.parseInt(numberTwoRaw);
	 
	 System.out.println ("Introduzca el tercer numero entrero");
	 String numberThreeRaw = reader.readLine();
	 double C = Integer.parseInt(numberThreeRaw);

	 double D = (B * B) - (4.0 * A * C);
	 if (D > 0.0) {
                double result1 = (-B + Math.pow(D, 0.5)) / (2.0 * A);
                double result2 = (-B - Math.pow(D, 0.5)) / (2.0 * A);
                System.out.println("The roots are " + result1 + " and " + result2);
     } else if (D == 0.0) {
                double result1 = -B / (2.0 * A);
                System.out.println("The root is " + result1);
     } else {
                System.out.println("The equation has no real roots.");
     }  

}  
}  
  
  
   


 
