import java.io.*;

	public class ejercicioDoce{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Exercici 12.
	Que el percentatge d’IVA sigui variable (introduït per l’usuari).*/
	 
	 
	 //Pedir al usuario el precio de un producto
	  System.out.println("introduzca el precio del producto");
	  
	  //Cojo la respuesta del usuario y la guardo en una variable llamada rawItemPrice
	  String rawItemPrice = reader.readLine();
	  
	  //Paso de String a Int(numero entero) la respuesta del usuario en la variable itemPrice
	  int itemPrice = Integer.parseInt(rawItemPrice);
	 
	 //Pedirle al usuario el IVA que desee
	 System.out.println("introduzca el precio del IVA");
	 
	 //cojer la respuesta del usuario(IVA) y guardarla en una variable (rawIvaImport)
	 String rawIvaImport = reader.readLine();
	 
	 //pasar el string a int de la respuesta del usuario
	 int ivaImport = Integer.parseInt(rawIvaImport);
	 
	 //Calcular y mostrar el IVA del producto por pantalla
	 double ivaProduct = itemPrice * ivaImport;
	System.out.println(ivaProduct);
	 
	 //Mostrar la cantidad total del producto con IVA
	 double myResult = itemPrice + ivaProduct;
	 System.out.println(myResult); 
	 
	 System.out.println();
	 System.out.println("la otra solucion");
	 calcularIVA(itemPrice,ivaImport);
	}
	
	//ESTO NI FLIPANDO HAY QUE ENTENDERLO AÚN
	static void calcularIVA(int importe, double iva) {
    	 double ivaProduct = importe * iva;
		System.out.println(ivaProduct);
		double myResult = importe + ivaProduct;
		System.out.println(myResult); 
}
	
	
	
}
