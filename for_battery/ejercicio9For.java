import java.io.*;

public class ejercicio9For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Escriu un programa que demani un enter positiu més gran que 0 i "dibuixi" 
 * un quadrat amb els nombres del 1 fins el valor de l'entrada. Per exemple, si l'entrada és 5, dibuixarà:
 *  1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
*/

	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
    for (int i = 1; i <= number; i++) {
        for (int j = 1; j <= number; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }


}
}

	
	
	
    
