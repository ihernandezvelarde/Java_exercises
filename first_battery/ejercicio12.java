import java.io.*;


public class ejercicio12 {
	
	public static void main (String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	//Modifica lâ€™exercici anterior perquÃ¨ el percentatge dâ€™IVA sigui variable (introduÃ¯t per lâ€™usuari).
	
	
	
	//Programa que demani una quantitat (Preu d'un producte)

	System.out.println("Introduce el precio de un producto");
	
	String itemPriceRaw = reader.readLine();

	double itemPrice = Integer.parseInt(itemPriceRaw);
	
	
	//Fes que el usuari introdueixi la quantitat d'IVA del producte

	System.out.println("Introdueix una quantitat d'IVA");

	String ivaRaw = reader.readLine();

	double iva = Integer.parseInt(ivaRaw);
	
	
	//Visulitzi la quantitat d'IVA (21%)
	
	double myResult = itemPrice * iva / 100;

	System.out.println("Esto seria el IVA");
	
	System.out.println(myResult);
	
	
	//I la quantital total a pagar (preu original + IVA)
	
	double myFinalResult = itemPrice + myResult;
	
	System.out.println("Esto seria el producto mas el IVA");
	
	System.out.println(myFinalResult);

}
}

