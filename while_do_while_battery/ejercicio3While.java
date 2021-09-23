import java.io.*;

	public class ejercicio3While{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	/*El programa continuarà oferint a l’usuari la possibilitat de calcular, fins que l’usuari respongui negativament.
      Atenció: cal evitar divisió per zero. Aviseu a l'usuari de l'error, però permeteu continuar calculant.*/

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
	 System.out.print ("ERROR");
	} else {
	System.out.println (number / numberTwo);
	}
}
	System.out.println ("\nQuieres hacer otra operacion?");
	String answer = reader.readLine();
	String answer1 = "si";
	String answer2 = "no" ;

	while (answer.equals(answer1)){
		System.out.println ("Introduzca el primer numero entrero para hacer la operacion");
		 numberRaw = reader.readLine();
		 number = Integer.parseInt(numberRaw);
		 
		 System.out.println ("Introduzca la operacion");
		 operation = reader.readLine();
		 
		 System.out.println ("Introduzca el segundo numero entrero");
		 numberTwoRaw = reader.readLine();
		 numberTwo = Integer.parseInt(numberTwoRaw);
	  
		 if(operation.equals("+") ) {
	 System.out.print (number + numberTwo);
	} else if (operation.equals("-") ) {
	 System.out.print (number - numberTwo);
	} else if (operation.equals("*") ) {
	 System.out.print (number * numberTwo);
	} else if (operation.equals("/") ) {
	 if (numberTwo == 0) {
	 System.out.print ("ERROR");
	} else {
	System.out.println (number / numberTwo);
	}
}
		System.out.println ("\nQuieres hacer otra operacion?");
		answer = reader.readLine();
		answer1 = "si";
		answer2 = "no" ; 
}
}
} 

 
