import java.io.*;

public class ejercicio4BExamen1B {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*1.	Ompli un array d'enters des del teclat.  L'usuari primer especificarà quants elements introduirà (valideu que sigui mínim 1), 
	 * i després els anirà introduint un per un (mireu exemple)
	2.	Informi si l'array té mes números negatius que positius (considerem el 0 positiu).  En cas afirmatiu ha d'especificar en quines posicions

	*/
		double pInfiniteDouble = Double.POSITIVE_INFINITY;;
		double allNumbers =0;
	
		String rawpositiveOrNegativeNumber = reader.readLine();
		double positiveOrNegativeNumber = Double.parseDouble(rawpositiveOrNegativeNumber);
	 
	 
		for (double i = 0; i < 5; i++){
			System.out.println("Introduzca 5 numeros tanto positivos como negativos");
			rawpositiveOrNegativeNumber = reader.readLine();
			positiveOrNegativeNumber = Integer.parseInt(rawpositiveOrNegativeNumber);
			allNumbers = allNumbers + positiveOrNegativeNumber;
			
			if(pInfiniteDouble > positiveOrNegativeNumber ){
			pInfiniteDouble = positiveOrNegativeNumber;
			
			if (pInfiniteDouble < allNumbers){
				
				}
				
		    }		
				

	}
	
}
}
