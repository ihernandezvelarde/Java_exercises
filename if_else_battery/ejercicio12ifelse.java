import java.io.*;

	public class ejercicio12ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//Desenvolupem un ajudant infantil per decidir que fer davant un semàfor (vermell, groc, verd). 
	//El programa demanarà de quin color està el semàfor i segons la resposta recomanarà passar, esperar, o córrer.
	
	 System.out.println ("Introduzca el color del semaforo");
	 String answer = reader.readLine();
	
	String answer1 = "verde";
	String answer2 = "rojo" ;
	String answer3 = "amarillo" ;	

	 if (answer.equals(answer1) ){
		 System.out.println ("Pasa");
	}if(answer.equals(answer2) ){
		 System.out.println ("Espera, no pases.");
	 }if(answer.equals(answer3) ){
		 System.out.println ("Corre Forest!");
   }
   
}
} 

 

