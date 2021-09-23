import java.io.*;

	public class ejercicio2ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Desenvolupa un programa que demani dos números i escrigui els dos números ordenats creixentment (de menor a major). Ex. si els números són 3 i 2, el resultat serà 2 3
	Indica com a comentari, que passa si els dos números són iguals..*/
	
	 System.out.println ("Introduzca el primer numero entrero");
	 String numberRaw = reader.readLine();
	 int number = Integer.parseInt(numberRaw);
	 
	 System.out.println ("Introduzca el segundo numero entrero");
	 String numberTwoRaw = reader.readLine();
	 int numberTwo = Integer.parseInt(numberTwoRaw);
	 
if (number < numberTwo) {
  System.out.println ("Ordenados seria asi");
  System.out.println(number);
  System.out.println(numberTwo);
  
} else if (numberTwo < number) {
 System.out.println ("Ordenados seria asi");
  System.out.println(numberTwo);
  System.out.println(number);
  
} else {
  System.out.println("Son iguales");
}
	
	
} 
}

