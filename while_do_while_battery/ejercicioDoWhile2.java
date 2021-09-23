import java.io.*;

	public class ejercicioDoWhile2{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	/*El programa continuarà oferint a l’usuari la possibilitat de calcular, fins que l’usuari respongui negativament.
      Atenció: cal evitar divisió per zero. Aviseu a l'usuari de l'error, però permeteu continuar calculant.*/
	String answer = "";
	String answer1 = "si";
	String answer2 = "no" ;

	do { 
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
			System.out.println ("Sobran " + result + " euro/s");
			}
		
	System.out.println("\nQuieres hacer otra operacion?");
	answer = reader.readLine();
	}
	while (answer.equals(answer1));
}
 
}
    
