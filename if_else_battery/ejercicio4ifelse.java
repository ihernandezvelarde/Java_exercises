import java.io.*;
import java.util.Scanner;

	public class ejercicio4ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Scanner in = new Scanner(System.in);
	
	/* Programa que demani un símbol a l’usuari i li mostri un missatge quan sigui una representació d’un dígit.*/
	 
	 
	 //PROGRAMA QUE TIENE QUE IMPRIMIR UN MENSAJE SI EL UJSUARIO INTRODUCE UN NUMERO.
	 
	 //Pedimos a el usuario que introduzca la informacion que necesitamos y creamos una variable que lea lo que usuario ponga
	
   System.out.println("Introduzca un caracter de todo el teclado"); 
   String line = reader.readLine();
   
   // char es para los caracteres ya sean letras o numeros y .charArt(0) te devuelve la posicion 0 
   //que en este caso es la que queremos que nos escanee ya que solo pedimos a el usuario 1 simbolo
   char character = line.charAt(0);
   
   //Hacemos un if else con .isDigit o .isLetter que podremos utilizar ya que hemos creado la variable character en "char" 
   if( Character.isDigit(character))
   System.out.println(character +" Es un digito");
   else if (Character.isLetter(character))
   System.out.println(character +" Es una letra");
  }
} 



