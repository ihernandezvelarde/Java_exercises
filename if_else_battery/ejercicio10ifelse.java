import java.io.*;

	public class ejercicio10ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
   System.out.println("Introduzca el precio del producto");
	String compraRaw = reader.readLine();
	double compra = Integer.parseInt(compraRaw);
	
    System.out.println("Introduzca el precio que ha pagado");
	String totalRaw = reader.readLine();
	double total = Integer.parseInt(totalRaw);    
	           
    double result = total - compra ;
    
    if (compra > total){
		}if (result < 0){
		result = -result; 
		System.out.println ("Falta por pagar " + result +  " euro/s");
	}	else {
			System.out.println (" Sobran " + result + " euro/s");
			}
}
} 

 


