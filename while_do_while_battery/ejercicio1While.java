import java.io.*;

	public class ejercicio1While{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//Desenvolupa un programa que demani a l’usuari un número positiu i retorni l'arrel quadrada.  
	//Si el número introduït és negatiu, el programa ha de mostrar un missatge d’error, i tornar a demanar a l’usuari el número.  
	//Mentre l’usuari torni a introduir una dada incorrecta, el programa repetirà el comportament anterior.
	
	System.out.println ("Introduzca el numero que quiera hacer su raiz cuadrada");
	 String numberRaw = reader.readLine();
	 double A = Double.parseDouble(numberRaw);
	 
	if (A>0){
		System.out.println("La raiz cuadrada de(" + A + ")=" + Math.sqrt(A));
		}
	while (A <= 0) {
		System.out.println( "ERROR, INTRODUZCA OTRO NUMERO");
			
	 System.out.println ("Introduzca el numero que quiera hacer su raiz cuadrada");
	 numberRaw = reader.readLine();
	 A = Integer.parseInt(numberRaw);
	 
	if (A>0){
		System.out.println("La raiz cuadrada de(" + A + ")=" + Math.sqrt(A));
		}
}
   
}
} 

 
