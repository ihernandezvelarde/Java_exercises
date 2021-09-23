import java.io.*;

	public class ejercicio13ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//Desenvolupa un programa que demani el nombre de fills de l'usuari i respongui tal i com indica el següent fragment de codi:
	//Cas nombredefills sigui
    // < 0: escriu "error, no pots tenir menys que 0 fills!"
    //   0: escriu "tot el que t'has estalviat en bolquers!"
    //   1: escriu "compte de no mimar-lo massa!"
    //   >1 AND <5: escriu "no t'avorreixes a casa eh?"
    //   > 4: escriu "tu sí fas país!"

	
	 System.out.println ("Cuantos hijos tienes?");
	 String answerRaw = reader.readLine();
	 int answer = Integer.parseInt(answerRaw);
	
	
	int answer0 = 0 ;
	int answer1 = 1 ;	

	if (answer <0 ){
			 System.out.println ("ERROR, no puedes tener menos de 0 hijos");
	}
		 
	if (answer == answer0){
		  System.out.println ("Todo lo que te has ahorrado en pañales");
	}
	
	if (answer == answer1){
				 System.out.println ("Cuidado no lo vayas a mimar mucho");
	}
				 
	if (answer == 2 || answer == 3 || answer == 4 ) {
					 System.out.println ("No te aburres en casa eeh");
	} 
	if (answer >= 5){
		System.out.println ("Tu si que haces pais");
		}
		 
}  
}
 

