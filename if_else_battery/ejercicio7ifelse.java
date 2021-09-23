import java.io.*;


public class ejercicio7ifelse {
  
  public static void main (String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//Dissenya un programa, que rebi com entrada una data- hora, segons el format
// DD-MM-AAAA - HH-MnMn-SS; i calculi quin moment sera quan hagi transcorregur un segon.

 System.out.println ("Introduzca un dia en numero (AA)");
 String dayRaw = reader.readLine();
 int day = Integer.parseInt(dayRaw);
 
 System.out.println ("Introduzca un mes en numero (MM)");
 String monthRaw = reader.readLine();
 int month = Integer.parseInt(monthRaw);
 
 System.out.println ("Introduzca un year en numero (AAAA)");
 String yearRaw = reader.readLine();
 int year = Integer.parseInt(yearRaw);
 
 System.out.println ("Introduzca una hora (HH)");
 String hourRaw = reader.readLine();
 int hour = Integer.parseInt(hourRaw);
 
 System.out.println ("Introduzca un minuto (MnMn)");
 String minuteRaw = reader.readLine();
 int minute = Integer.parseInt(minuteRaw);
  
 System.out.println ("Introduzca un segundo (SS)");
 String secondRaw = reader.readLine();
 int second = Integer.parseInt(secondRaw);  
 
 
 int secondsResult = second +1;
 
 // Si el resultado de los segundos es == a 60 los segundos serán 0 y sumaremos un minuto. 
 if (secondsResult >= 60) {
	second = 0;
	minute += 1; //+= Quiere decir que es igual a si mismo mas uno.
		if (minute >= 60){
			minute = 0;
			hour += 1;
			if (hour >= 24){
				hour = 0;
				day += 1;
				if (month == 04 || month == 06 || month == 9 || month == 11 ) {
					if (day >= 31) {
						day = 1;
						month += 1;
						System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (second));
					} else { //sino se imprime tal cual porque ya hemos sumado 1 dia en la linea 48
						System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (second));
					   }
				} else {
					if (day >= 32){
						day = 1;
						month += 1;
						if ( month > 12){ // este if es porque solo en los meses contemplados en el else esta el mes 12  por lo que tendriamos que sumarle 1 año.
							month = 1;
							year += 1;
							 System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (second));

						}
					} else { //sino se imprime tal cual porque ya hemos sumado 1 mes en la linea 60
						System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (second));

						}
				}
			} else { //sino se imprime tal cual porque ya hemos sumado 1 hora en la linea 44
				System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (second));
				}
		} else { //sino se imprime tal cual porque ya hemos sumado 1 minuto en la linea 41
			System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (second));

			}
 } else { //sino se imprime tal cual porque ya hemos sumado 1 segundo en la linea 36
	 System.out.println ( (day) +"/"+ (month) +"/"+ (year) +"/  "+ (hour) +"/"+ (minute) + "/" + (secondsResult));

	 }
 
}
}    

