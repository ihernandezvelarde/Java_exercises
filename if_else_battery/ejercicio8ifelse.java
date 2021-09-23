import java.io.*;

	public class ejercicio8ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	/* Desenvolupa un programa que demani tres números i escrigui els tres números ordenats creixentment (de menor a major).
	 *  Ex. si els números són 3, 4 i 2, el resultat serà 2 3 4.*/
	
	 System.out.println ("Introduzca el primer numero entrero");
	 String numberRaw = reader.readLine();
	 int number = Integer.parseInt(numberRaw);
	 
	 System.out.println ("Introduzca el segundo numero entrero");
	 String numberTwoRaw = reader.readLine();
	 int numberTwo = Integer.parseInt(numberTwoRaw);
	 
	 System.out.println ("Introduzca el tercer numero entrero");
	 String numberThreeRaw = reader.readLine();
	 int numberThree = Integer.parseInt(numberThreeRaw);
	 
if ((number < numberTwo) && (numberTwo < numberThree)){
    System.out.println("Ordenados seria " + number + " " + numberTwo + " " + numberThree);
    }
if ((number < numberTwo) && (numberTwo > numberThree)){
    System.out.println("Ordenados seria " + number + " " + numberThree + " " + numberTwo);
    }
if ((number > numberTwo) && (numberTwo > numberThree)){
    System.out.println("Ordenados seria " + numberThree + " " + numberTwo + " " + number);
    }
if ((number > numberTwo) && (numberTwo < numberThree)){
    System.out.println("Ordenados seria " + numberTwo + " " + number + " " + numberThree);
    }
}
}


 



