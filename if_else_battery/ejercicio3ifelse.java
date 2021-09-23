import java.io.*;

	public class ejercicio3ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Dissenya un programa que demani a l’usuari dos números (positius o negatius i l’indiqui si el seu producte es 0, mes gran que 0 o mes petit que 0.*/
	 System.out.println ("Introduzca el primer numero entrero positivo o negativo");
	 String numberRaw = reader.readLine();
	 int number = Integer.parseInt(numberRaw);
	 
	 System.out.println ("Introduzca el segundo numero entrero positivo o negativo");
	 String numberTwoRaw = reader.readLine();
	 int numberTwo = Integer.parseInt(numberTwoRaw);
	 int result = number * numberTwo;
	 
if (result < 0) {
  System.out.println("El producto es menor que 0");
} else if (result > 0) {
  System.out.println("El producto es mayor que 0");
} else {
  System.out.println("El producto es igual a 0");
}
} 
}

