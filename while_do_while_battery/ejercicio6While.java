import java.io.*;
import java.util.Random;

	public class ejercicio6While{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();
	
	String answer = "";
	String answer1 = "si";
	String answer2 = "no" ;
	
	
			System.out.println("             Tragaperras OuYEAH!");
			
	do{
	int randomLimit = 10;
	int intRandomOne = rand.nextInt(randomLimit); 
	int intRandomTwo = rand.nextInt(randomLimit); 
	int intRandomThree = rand.nextInt(randomLimit); 
	
	int randomLimit2 = 6;
	int intRandomFour = rand.nextInt(randomLimit2);
	
	int avance1 = intRandomOne + intRandomFour;
	if (avance1 > 9){
			avance1 = avance1-10;
			}
	int avance2 = intRandomTwo + intRandomFour;
	if (avance2 > 9){
			avance2 = avance2-10;
		}
	int avance3 = intRandomThree + intRandomFour;
	if (avance3 > 9){
			avance3 = avance3-10;
		}
	int money = 0;
	
	
	System.out.println("+-------------------------------------------+");
	System.out.println("|     " +     intRandomOne  +  "      |       " +      intRandomTwo    +  "        |       "  +    intRandomThree    +"     |        " );	
	System.out.println("+-------------------------------------------+");
	
	if (intRandomOne == intRandomTwo && intRandomThree == intRandomOne){
			money = money + 250;
			System.out.println("PREMIO los tres numeros son iguales, ganas 250 euros");

		}else if ( intRandomOne == 7 || intRandomThree == 7){
			money = money + 1;
			System.out.println(" PREMIO tienes un 7 en primera o ultima posicion, ganas 1 euro");

		}else if (intRandomOne == intRandomTwo || intRandomOne == intRandomThree || intRandomTwo == intRandomThree){
			money = money + 20;
			System.out.println(" PREMIO tienes dos numeros iguales, 20 euros");
		}
	
	System.out.println ("Presione 1 para avanzar la primera casilla, 2 para la segunda, 3 para la tercera, si no desea mas avances presione 0.");
	String avanceRaw = reader.readLine();
	int avance = Integer.parseInt(avanceRaw);
	
	if ( avance == 1){
		System.out.println("+-------------------------------------------+");
		System.out.println("|     " +     avance1 + "      |       " +      intRandomTwo    +  "        |       "  +    intRandomThree    +"     |        " );	
		System.out.println("+-------------------------------------------+");
		
		if (avance1 == intRandomTwo && intRandomThree == avance1){
			money = money + 250;
			System.out.println("PREMIO los tres numeros son iguales, ganas 250 euros");

		}else if ( avance1 == 7 || intRandomThree == 7){
			money = money + 1;
			System.out.println(" PREMIO tienes un 7 en primera o ultima posicion, ganas 1 euro");

		}else if (avance1 == intRandomTwo || avance1 == intRandomThree || intRandomTwo == intRandomThree){
			money = money + 20;
			System.out.println(" PREMIO tienes dos numeros iguales, 20 euros");
		}

		}else if (avance == 2) {
		System.out.println("+-------------------------------------------+");
		System.out.println("|     " +     intRandomOne + "      |       " +      avance2    +  "        |       "  +    intRandomThree    +"     |        " );
		System.out.println("+-------------------------------------------+");
		
		if (avance2 == intRandomOne && intRandomThree == avance2){
			money = money + 250;
			System.out.println("PREMIO los tres numeros son iguales, ganas 250 euros");

		}else if ( avance2 == 7 || intRandomThree == 7){
			money = money + 1;
			System.out.println(" PREMIO tienes un 7 en primera o ultima posicion, ganas 1 euro");

		}else if (avance2 == intRandomOne || avance2 == intRandomThree || intRandomOne == intRandomThree){
			money = money + 20;
			System.out.println(" PREMIO tienes dos numeros iguales, 20 euros");
		}
		
		}else if (avance == 3) {
			System.out.println("+-------------------------------------------+");
			System.out.println("|     " +     intRandomOne + "      |       " +      intRandomTwo    +  "        |       "  +    avance3    +"     |        " );
			System.out.println("+-------------------------------------------+");
			
		if (avance3 == intRandomOne && intRandomTwo == avance3){
			money = money + 250;
			System.out.println("PREMIO los tres numeros son iguales, ganas 250 euros");

		}else if ( avance3 == 7 || intRandomOne == 7){
			money = money + 1;
			System.out.println(" PREMIO tienes un 7 en primera o ultima posicion, ganas 1 euro");

		}else if (avance3 == intRandomOne || avance3 == intRandomTwo || intRandomOne == intRandomTwo){
			money = money + 20;
			System.out.println(" PREMIO tienes dos numeros iguales, 20 euros");
		}
			
			
		} else if (avance == 0){
			System.out.println("No desea mas avances");
		} 
		 System.out.println("\nQuieres jugar otra vez?");
		 answer = reader.readLine();
}
	while (answer.equals(answer1));
	}
}

