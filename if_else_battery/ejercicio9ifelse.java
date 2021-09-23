import java.io.*;

	public class ejercicio9ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	/* Desenvolupa una calculadora senzilla que demani a l’usuari un primer operand numèric, (un numero cualquiera)  una operació (+ - * /) 
	 * i un segon operand (otro numero), i escrigui el resultat d’aplicar l’operació als operands.
	 * Ves amb compte per si alguna operació no és vàlida amb certs operands (p.ex divisió per zero).*/
	
	System.out.println ("Introduzca el primer numero entrero para hacer la operacion");
	 String numberRaw = reader.readLine();
	 int number = Integer.parseInt(numberRaw);
	 
	 System.out.println ("Introduzca la operacion");
	 String operation = reader.readLine();
	 
	 System.out.println ("Introduzca el segundo numero entrero");
	 String numberTwoRaw = reader.readLine();
	 int numberTwo = Integer.parseInt(numberTwoRaw);
  
 if(operation.equals("+") ) {
 System.out.print (number + numberTwo);
} else if (operation.equals("-") ) {
 System.out.print (number - numberTwo);
} else if (operation.equals("*") ) {
 System.out.print (number * numberTwo);
} else if (operation.equals("/") ) {
 if (numberTwo == 0) {
 System.out.print ("Subnormal");
} else {
System.out.print (number / numberTwo);
}
}
} 
}
 


