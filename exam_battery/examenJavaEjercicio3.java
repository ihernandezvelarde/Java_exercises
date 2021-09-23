import java.io.*;

public class examenJavaEjercicio3 {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
     	System.out.println("Introduzca un numero");
		String rawNumber = reader.readLine();
		int number = Integer.parseInt(rawNumber);
		
		
        if(number >= 0 && number <20) {
			
           //Linea superior
            for(int i = 0; i <= number-number; i++) {
                System.out.print("+");
                for(int j = 0; j < number-2; j++) {
                    System.out.print("-");
                }
               System.out.print("+");

            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < number-2; i++) {
                System.out.print("|");
                for(int j = 0; j < number-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
           
            //Linea inferior
              for(int i = 0; i <= number-number; i++) {
                System.out.print("+");
                for(int j = 0; j < number-2; j++) {
                    System.out.print("-");
                }
                System.out.print("+");

            }
            System.out.println();
            }else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 20");
        }
 }      
}
    




