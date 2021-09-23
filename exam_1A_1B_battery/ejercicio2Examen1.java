import java.io.*;

public class ejercicio2Examen1 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*Feu un programa anomenat SumarFinsLimit que llegeixi des del teclat un valor enter i tot seguit mostri fins a quin punt de la seqüència ordenada de nombre positius (1, 2, 3, etc.) 
	 * cal sumar per arribar al número més proper per sota d’aquest valor.  
	 * Finalment, ha de mostrar quina és la suma d’aquests nombres.
	 *  Per exemple, si la entrada és el número 12, el resultat és mostrar els números 1, 2, 3, 4, i la seva suma, que és 10, ja que si s’inclou el 5 ens passem.  
	*/

    int contador = 0;
	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	for (int i = 1; i <= number; i++){
		System.out.print(i + ",");
		if(contador > number){
			break;
			}else{
				contador = contador+i;
				}
	}
		System.out.print("y su suma es " + contador);
	
				
	}
	
	}



