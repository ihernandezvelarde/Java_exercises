import java.io.*;

	public class ejercicio11ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*Desenvolupa un metge virtual especialista en refredats. El nostre metge, només té les següents regles que aplica en ordre:*/
	//1.Si el malalt presenta esternuts i mal de cap llavors, si té problemes d’estómac li recomanarà prendre paracetamol i si no en té li proposarà prendre àcid acetil salicílic (AAS).
	//2.Si el malalt ens diu que té tos llavors, si és massa jove (menor de 12 anys) li recomanarà un caramel de mel i altrament li proposarà un caramel d’eucaliptus.
	//3. Si no presenta cap dels anteriors símptomes, el metge proposarà al pacient que vingui a la seva consulta presencial per poder examinar-lo.
	
   System.out.println ("Tienes estornudos y dolor de cabeza?");
   String hasSneeze = reader.readLine();
   
	if (hasSneeze.equals ("si")){
	   System.out.println ("Tienes dolor de estomago?");
	   String hasStomachache = reader.readLine();
	   
		if (hasStomachache.equals ("si")){
			System.out.println ("Tomate paracetamol");
		} else {
			System.out.println ("Tomate AAS");
		}
		
		System.out.println ("Tienes tos?");
		String hasCough = reader.readLine();
		
		if (hasCough.equals ("si")){
			System.out.println ("Que edad tienes?");
			String ageRaw = reader.readLine();
			int age = Integer.parseInt(ageRaw);
			if (age >=12){
				System.out.println ("Tomate un caramelo de eucalipto");
			} else if (age >0 && age < 12) {
				System.out.println ("Tomate un caramelo de miel");
			} 
		}
	   
	} else {
		System.out.println ("Tienes tos?");
		String hasCough = reader.readLine();
		
		if (hasCough.equals ("si")){
			System.out.println ("Que edad tienes?");
			String ageRaw = reader.readLine();
			int age = Integer.parseInt(ageRaw);
			if (age >=12){
				System.out.println ("Tomate un caramelo de eucalipto");
			} else if (age >0 && age < 12) {
				System.out.println ("Tomate un caramelo de miel");
			} 
		} else {
			System.out.println ("Ves al medico");
		}
	}
}
} 

 


