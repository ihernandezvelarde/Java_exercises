import java.io.*;

public class ejercicio4Examen1B {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*1.	Ompli un array d'enters des del teclat.  L'usuari primer especificarà quants elements introduirà (valideu que sigui mínim 1), 
	 * i després els anirà introduint un per un (mireu exemple)
	2.	Informi si l'array té mes números negatius que positius (considerem el 0 positiu).  En cas afirmatiu ha d'especificar en quines posicions

	*/
	
		int contadorNumPositive = 0;
		int contadorNumNegative = 0;
	
		String rawpositiveOrNegativeNumber = reader.readLine();
		int positiveOrNegativeNumber = Integer.parseInt(rawpositiveOrNegativeNumber);
	 
		System.out.println("Introduce cuantos numeros quieres escribir");
		String rawNumeroDeNumeros = reader.readLine();
		int numeroDeNumeros = Integer.parseInt(rawNumeroDeNumeros);
		
		do{
			System.out.println("EROOR el numero debe ser minimo 1");
			System.out.println("Introduce cuantos numeros quieres escribir");
			rawNumeroDeNumeros = reader.readLine();
			numeroDeNumeros = Integer.parseInt(rawNumeroDeNumeros);
			
		}while(numeroDeNumeros <1);
		
		for (int i = 0; i < numeroDeNumeros; i++){
			System.out.println("Introduzca numeros tanto positivos como negativos");
			rawpositiveOrNegativeNumber = reader.readLine();
			positiveOrNegativeNumber = Integer.parseInt(rawpositiveOrNegativeNumber);
			
			if(positiveOrNegativeNumber > 0){ 
				contadorNumPositive = contadorNumPositive +1;
				
			}else if (positiveOrNegativeNumber < 0){
				contadorNumNegative = contadorNumNegative +1;
				
		    }		
				
		}
		if (contadorNumPositive>contadorNumNegative){
				System.out.println("Hay mas numeros positivos que negativos");
			}else if (contadorNumPositive<contadorNumNegative){
				System.out.println("Hay mas numeros negativos que positivos");
			}else{
				System.out.println("Hay los mismos numeros negativos que positivos");

	}
	
}
}
