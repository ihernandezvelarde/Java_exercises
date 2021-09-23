import java.io.*;

public class ejercicio1Examen1B {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*Simula el comportament d’un cronòmetre regressiu, imprimint hora, minuts i segons des d’una hora, minuts i segons 
	 * introduïts per l’usuari; fins les 00:00:00 (és a dir, comptant cap en darrera).  
	 * Per exemple, si l’usuari introdueix un 4, un 54 i un 20, el programa imprimira totes les hores:minuts:segons des de les 04:54:20, fins les 00:00:00. 
	 *  No cal validar les dades d’entrada. 
	*/
	 
	 String hoursRaw = reader.readLine();
	 int hours = Integer.parseInt(hoursRaw);
	 String minutesRaw = reader.readLine();
	 int minutes = Integer.parseInt(minutesRaw);
     String secondsRaw = reader.readLine();
	 int seconds = Integer.parseInt(secondsRaw);
	 
     
	 System.out.println("Introduzca des de que hora quiere que empiece a contar el cronometro en cuenta regresiva");
	 hoursRaw = reader.readLine();
	 hours = Integer.parseInt(hoursRaw);
	 
	 System.out.println("Introduzca des de que minuto quiere que empiece a contar el cronometro en cuenta regresiva");
	 minutesRaw = reader.readLine();
	 minutes = Integer.parseInt(minutesRaw);
	 
	 System.out.println("Introduzca des de que segundo quiere que empiece a contar el cronometro en cuenta regresiva");
	 secondsRaw = reader.readLine();
	 seconds = Integer.parseInt(secondsRaw);
	 
	 
	
	for (int i = hours; i >= 00; i--){
		System.out.println("LAS HORAS SON " + i);
		System.out.println (i);
		for (int j = minutes; j >= 00; j--){
			System.out.println("LOS MINT SON " + j);
			System.out.println (j);
			for (int k = seconds; k >= 00; k--){
				if (seconds == 0){
					seconds = 60;
					}
				System.out.println("LOS SRC SON " + k);
				System.out.println (k);
				
	}
}
	

		
	}			
	}

}	



