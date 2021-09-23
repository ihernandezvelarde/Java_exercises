import java.io.*;

public class ejercicio10For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
/*Escriu un programa que demani un dos enters positius més gran que 0 i "dibuixi" un rectangle com el que es mostra a continuació. Per exemple, si l'entrada és 5 i 3, dibuixarà:
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5

*/

	System.out.println("Introduzca un numero");
	String rawNumber = reader.readLine();
	int number = Integer.parseInt(rawNumber);
	
	System.out.println("Introduzca un numero");
	String rawNumber2 = reader.readLine();
	int number2 = Integer.parseInt(rawNumber2);
	
    for (int i = 1; i <= number2; i++) {
        for (int j = 1; j <= number; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }


}
}

	
	
	
    
