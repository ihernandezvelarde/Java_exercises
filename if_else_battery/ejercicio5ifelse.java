import java.io.*;

	public class ejercicio5ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	/* Programa que obtingui el descompte (en quantitat i en percentatge) aplicat a un producte si l’usuari introdueix el preu original i el preu pagat.*/
	
   System.out.println("Introduzca el precio inicial del producto");
	String compraRaw = reader.readLine();
	double compra = Integer.parseInt(compraRaw);
	
    System.out.println("Introduzca el precio por el que te ha salido el producto");
	String totalRaw = reader.readLine();
	double total = Integer.parseInt(totalRaw);    
	           
    double descuento = compra - total;
    double resultado = descuento / compra *100;
    System.out.println ("Se hara un descuento de " + descuento + " euros");
    System.out.println ("Por lo que el descuento sera del " + resultado + "%");;
}
} 

 


