import java.io.*;

public class ejercicio1For {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
//Desenvolupa un programa que escrigui els primers 100 nombres naturals en ordre decreixent (un número per línia)	
	
	for (int i = 0; i <= 100; i++){
		if (i == 100){
			System.out.print(i);
		}else{
			System.out.print(i + ",");
			}
	}
	System.out.println("");

	for (int i = 0; i <= 100; i++){
			System.out.println(i);
			}

		
	}
}

