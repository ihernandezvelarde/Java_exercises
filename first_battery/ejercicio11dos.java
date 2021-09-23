import java.io.*;

	public class ejercicio11dos{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Programa que demani una quantitat –preu d’un producte – i calculi i visualitzi la quantitat d’IVA (aplicant un percentatge del 21 %) 
	 * i la quantitat total a pagar (preu original + Iva).*/
	 
	 
	 
	 //Pedir al usuario el precio de un producto
	  System.out.println("introduzca el precio del producto");
	  
	  //Cojo la respuesta del usuario y la guardo en una variable llamada userAnswer
	  String userAnswer = reader.readLine();
	  
	  //Paso de String a Int(numero entero) la respuesta del usuario en la variable itemPrice
	  int itemPrice = Integer.parseInt(userAnswer);
	  
	 
	 //Calcular y mostrar el IVA del producto por pantalla
	 double ivaProduct = itemPrice * 0.21;
	System.out.println(ivaProduct);
	 
	 
	 //Mostrar la cantidad total del producto con IVA
	 double myResult = itemPrice + ivaProduct;
	 System.out.println(myResult); 
	}
}
