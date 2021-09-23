import java.io.*;

	public class ejercicio3Examen1{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*Simula el comportament d’un cronòmetre, imprimint hora, minuts i segons des d’una hora (sense minuts ni segons) introduïda per l’usuari, 
	 * fins altre segona hora també introduïda per l’usuari (igualment sense minuts ni segons).  
	 * Per exemple, si l’usuari introdueix un 4 i un 22, el programa imprimira totes les hores:minuts:segons entre les 4:00:00 i les 22:00:00.  
	 * No cal validar les dades d’entrada.*/
	
	 int contadorSeconds = 00;
	 int contadorMinutes = 00;
	 int contadorHours = 00; 
	 
	 System.out.println("Introduzca des de que hora quiere que empiece a contar el cronometro por favor");
	 String hour1Raw = reader.readLine();
	 int hour1 = Integer.parseInt(hour1Raw);
	 
	 System.out.println("Introduzca a que hora quiere que el cronometro se detenga por favor");
	 String hour2Raw = reader.readLine();
	 int hour2 = Integer.parseInt(hour2Raw);
	
	for (int i = hour1; i <= hour2; i++){
		System.out.println("LAS HORAS SON " + contadorHours);
		contadorHours = contadorHours+1;
		
		//System.out.printf("%02d%n",contadorHours);
		for (int j = contadorMinutes; j <= 60; j++){
			System.out.println("LOS MINT SON " + contadorMinutes);
			contadorMinutes = contadorMinutes +1;
			//System.out.printf("%02d%n",contadorMinutes);
			for (int k = contadorSeconds; k <= 6; k++){
				System.out.println("LOS SEC SON " + contadorSeconds);
				contadorSeconds = contadorSeconds +1;
				//System.out.printf("%02d%n",contadorSeconds);

		 } 
		 
	}
}	
}
} 

 

