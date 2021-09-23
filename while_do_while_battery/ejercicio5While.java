import java.io.*;

	public class ejercicio5While{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	/*Es vol simular el funcionament d'una màquina expenedora de monedes.  
	 * Dissenyeu un  programa que desglossi una quantitat de diners (introduïda per l'usuari) en el mínim nombre de bitllets i monedes possibles 
	 * (indicant a l'usuari per pantalla quin és el resultat per a cada moneda en el cas de que la quantitat no sigui zero).*/
      
	int container500 = 0;
	int container200 = 0;
	int container100 = 0;
	int container50 = 0;
	int container20 = 0;
	int container10 = 0;
	int container5 = 0;
	int container2 = 0;
	int container1 = 0;
	int container050 = 0;
	int container020 = 0;
	int container010 = 0;
	int container005 = 0;
	int container002 = 0;
	int container001 = 0;
	double money = 0;

	System.out.println("Introduzca una cantidad de dinero para darle el cambio");
	String moneyRaw = reader.readLine();
	money = Double.parseDouble(moneyRaw);
	
	do { 

	if (money >= 500){
		 money = money -500;
		 container500 = container500 +1;
	} else if (money >= 200){
		money = money -200;
		container200 = container200 +1;
	}else if (money >= 100) {
		money = money -100;
		container100 = container100 +1;	
	}else if (money >= 50) {
		money = money -50;
		container50 = container50 +1;	
	}else if (money >= 20) {
		money = money -20;
		container20 = container20 +1;	
	}else if (money >= 10) {
		money = money -10;
		container10 = container10 +1;	
	}else if (money >= 5) {
		money = money -5;
		container5 = container5 +1;	
	}else if (money >= 2) {
		money = money -2;
		container2 = container2 +1;	
	}else if (money >= 1) {
		money = money -1;
		container1 = container1 +1;	
	}else if (money >= 0.50) {
		money = money -0.50;
		container050 = container050 +1;	
	}else if (money >= 0.20) {
		money = money -0.20;
		container020 = container020 +1;	

	}else if (money >= 0.10) {
		money = money -0.10;
		container010 = container010 +1;	
	}else if (money >= 0.05) {
		money = money -0.05;
		container005 = container005 +1;	
	}else if (money >= 0.02) {
		money = money -0.02;
		container002 = container002 +1;	
	}else if (money >= 0.01
	) {
		money = money -0.01;
		container001 = container001 +1;	
	}
	}
	while (money != 0);
	
	if (container500 != 0) {
		System.out.println("Aqui tienes "+container500+" billete de 500 euros");
		}
	if (container200 != 0) {
		System.out.println("Aqui tienes "+container200+" billete de 200 euros");
		}
	if (container100 != 0) {
		System.out.println("Aqui tienes "+container100+" billete de 100 euros");
		}
	if (container50 != 0) {
		System.out.println("Aqui tienes "+container50+" billete de 50 euros");
		}
	if (container20 != 0) {
		System.out.println("Aqui tienes "+container20+" billete de 20 euros");
		}
	if (container10 != 0) {
		System.out.println("Aqui tienes "+container10+" billete de 10 euros");
		}
	if (container5 != 0) {
		System.out.println("Aqui tienes "+container5+" billete de 5 euros");
		}
	if (container2 != 0) {
		System.out.println("Aqui tienes "+container2+" monedas de 2 euros");
		}
	if (container1 != 0) {
		System.out.println("Aqui tienes "+container1+" monedas de 1 euros");
		}
	if (container050 != 0) {
		System.out.println("Aqui tienes "+container050+" monedas de 0.50 centimos");
		}
	if (container020 != 0) {
		System.out.println("Aqui tienes "+container020+" monedas de 0.20 centimos");
		}
	if (container010 != 0) {
		System.out.println("Aqui tienes "+container010+" monedas de 0.10 centimos");
		}
	if (container005 != 0) {
		System.out.println("Aqui tienes "+container005+" monedas de 0.05 centimos");
		}
	if (container002 != 0) {
		System.out.println("Aqui tienes "+container002+" monedas de 0.02 centimos");
		}
	if (container001 != 0) {
		System.out.println("Aqui tienes "+container001+" monedas de 0.01 centimos");
		}									

	}
 
}
    
